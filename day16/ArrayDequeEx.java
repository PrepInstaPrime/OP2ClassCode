import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Queue<Integer> q= new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
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
