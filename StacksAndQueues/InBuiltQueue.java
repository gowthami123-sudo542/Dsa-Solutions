//Inbuilt Queues are interfaces in java
import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(45);
        queue.add(50);
        queue.add(56);
        System.out.println(queue.peek());
    }
}
