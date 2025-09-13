class DNode{
    int data;
    DNode next;
    DNode prev;
    public DNode(int data){
        this.data= data;
        this.next=null;
        this.prev=null;
    }
}
public class DoublyLinkedList {
    public DNode head;
    public DNode tail;
    public void append(int data){
        DNode newNode= new DNode(data);
        if(head==null){
            head=newNode;
            tail= newNode;
            return;
        }
        tail.next= newNode;
        newNode.prev= tail;
        tail= newNode;
    }
    public void displayFromStart(){
        if(head==null){
            System.out.println("null");
            return;
        }
        DNode temp = head;
        System.out.print("null<-");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public void prePend(int data){
        DNode newNode= new DNode(data);
        if(head==null){
            head= newNode;
            tail= newNode;
            return;
        }
        newNode.next= head;
        head.prev= newNode;
        head= newNode;
    }
    public void delete(int data){
        // what if list is empty
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        // what if we need to delete first value and we had only one node
        if(head.data==data && tail.data==data){
            head=head.next;
            tail= tail.next;
            System.out.println(data + " deleted successfully");
            return;
        }
        // what if head and tail are not same and need to delete first value 
        if(head.data==data){
            head= head.next;
            System.out.println(data + " deleted successfully");
            return;
        }
        DNode temp=head;
        while (temp.next!=null&&temp.next.data!=data) {
            temp= temp.next;
        }
        // what if value was not there
        if(temp.next==null){
            System.out.println("Value is not in list");
            return;
        }
        if(temp.next.next!=null){
            temp.next.next.prev=temp;
        }
        temp.next=temp.next.next;
        
        System.out.println(data + " deleted successfully");
    }
    public static void main(String[] args) {
         DoublyLinkedList list = new DoublyLinkedList();
         list.append(1);
         list.append(2);
         list.append(3);
         list.append(4);
         list.displayFromStart();
         list.prePend(0);
         list.displayFromStart();
        // deleting head
        //  list.delete(0);
        // deleting mid
        //  list.delete(3);
        // deleting last
        list.delete(4);
        list.displayFromStart();
    }
}
