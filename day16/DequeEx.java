import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {
        Deque<Integer> q= new ArrayDeque<>();
        q.add(1);
        q.addFirst(3);
        q.addLast(5);
        // System.out.println(q);
        // q.poll();
        // System.out.println(q);
        // q.pollLast();
        // System.out.println(q);
        // q.removeFirst();
        // System.out.println(q);
        // q.removeLast();
        System.out.println(q);
        // peek
        System.out.println(q.peek());
        // peekLast
        System.out.println(q.peekLast());
        // size
        System.out.println(q.size());
        // check empty 
        System.out.println(q.isEmpty());

    }
}
