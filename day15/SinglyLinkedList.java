class Node{
    int data;
    Node next;
    public Node(int data){
        this.data= data;
        this.next=null;
    }
}
public class SinglyLinkedList {
    public Node head;
    public void append(int data){
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        Node temp= head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next= newNode;
    }
    public void display(){
        if(head==null){
            System.out.println("null");
            return;
        }
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public void prePend(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head= newNode;
    }
    public void delete(int data){
        // check if list is already emmpty
         if(head==null){
            System.out.println("list is empty");
            return;
         }
         // deleting the first node
         if(head.data==data){
            head=head.next;
            System.out.println(data + " deleted Successfully");
            return;
         }
         Node temp= head;
         while(temp.next!=null&&temp.next.data!=data){
            temp= temp.next;
         }
         // check if data was not there only then your temp.next==null;
         if(temp.next==null){
            System.out.println(" data is not available");
            return;
         }
         // if data found , delete it
         temp.next= temp.next.next;
         System.out.println(data + " deleted Successfully");
    }
    public static void main(String[] args) {
        SinglyLinkedList list= new SinglyLinkedList();
        // System.out.println(list.head);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(5);
        list.display();
        // list.delete(1);
        // list.display();
        // list.delete(3);
        list.delete(5);
        list.display();

    }
}
