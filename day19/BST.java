import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BST {
    public TreeNode root;
    public void insert(int data){
        TreeNode newNode= new TreeNode(data);
        if(root==null){
            root=newNode;
            return;
        }
        insertData(root, newNode);

    }
    public void insertData(TreeNode node, TreeNode dataNode){
        if(node.data>dataNode.data){
            if(node.left==null){
                node.left=dataNode;
            }else{
                insertData(node.left, dataNode);
                return;
            }
        }else{
            if(node.right==null){
                node.right=dataNode;
            }else{
                insertData(node.right, dataNode);
                return;
            }
        }
    }
    public void inOrder(TreeNode node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data +" ");
        inOrder(node.right);
    }
    // BFS or level order traversal
    public void bfs(TreeNode node){
        if(node==null){
            System.out.println("Tree is empty");
            return;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            TreeNode temp= q.poll();
            System.out.print(temp.data +" ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        BST tree= new BST();
        tree.insert(9);
        tree.insert(6);
        tree.insert(12);
        tree.insert(8);
        tree.inOrder(tree.root);
        System.out.println();
        tree.bfs(tree.root);
    }
}
