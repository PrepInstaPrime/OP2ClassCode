class CNode{
    int data;
    CNode next;
    public CNode(int data){
        this.data= data;
        this.next=null;
    }
}
public class CircularLinkedList {
    public CNode head=null;
    public void insert(int data){
        CNode newNode= new CNode(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        CNode temp= head;
        while(temp.next!=head){
            temp= temp.next;
        }
        temp.next= newNode;
        newNode.next=head;
    }
    public void display(){
        if(head==null){
            System.out.println("null");
            return;
        }
        CNode temp= head;
        while(temp.next!=head){
            System.out.print(temp.data);
            temp= temp.next;
        }

    }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
    }
}
