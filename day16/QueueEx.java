import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        // add the values 
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // System.out.println(q.add(3));
        // System.out.println(q.offer(4));
        // removing the value
        int val=q.poll();
        System.out.println(val);
        System.out.println(q);
        // getting front value without removing
        System.out.println(q.peek());
        // check for empty 
        System.out.println(q.isEmpty());
        // size 
        System.out.println(q.size());
    }
}
