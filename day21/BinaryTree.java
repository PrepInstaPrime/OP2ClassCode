import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTree {
    public TreeNode root;

    public void insert(int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                q.offer(temp.left);
            }
            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                q.offer(temp.right);
            }
        }
    }

    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void delete(int data) {
        if (root == null) {
            System.out.println("Tree is already empty");
            return;
        }
        if (root.left == null && root.right == null) {
            if (root.data == data) {
                root = null;
                return;
            } else {
                System.out.println("data not found");
            }
        }
        TreeNode temp = null;
        TreeNode keyNode = null;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            temp = q.poll();
            if (temp.data == data) {
                keyNode = temp;
            }
            if (temp.left != null) {
                q.offer(temp.left);
            }
            if (temp.right != null) {
                q.offer(temp.right);
            }
        }
        if (keyNode == null) {
            System.out.println("data was not found");
        } else {
            int lastData = temp.data;
            deleteDeepest(temp);
            keyNode.data = lastData;
        }

    }
    public void deleteDeepest(TreeNode node) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.left != null) {
                if (temp.left == node) {
                    temp.left = null;
                    return;
                } else {
                    q.offer(temp.left);
                }
            }
            if (temp.right != null) {
                if (temp.right == node) {
                    temp.right = null;
                    return;
                } else {
                    q.offer(temp.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.inorder(tree.root);
        System.out.println();
        tree.delete(1);
        tree.inorder(tree.root);
    }
}