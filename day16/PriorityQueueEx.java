import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> q= new PriorityQueue<>();
        q.add(5);
        q.add(6);
        System.out.println(q.peek()); // 5
        q.add(4);
        System.out.println(q.peek());
    }
}
