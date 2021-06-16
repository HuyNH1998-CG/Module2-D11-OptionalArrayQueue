import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(10);
        queue.dequeue();
        queue.enqueue(50);
        queue.enqueue(54);
        queue.enqueue(512);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(123);
        queue.dequeue();
        queue.enqueue(120);
        queue.enqueue(504);
        queue.enqueue(128);
        queue.enqueue(456);
        System.out.println(Arrays.toString(queue.getQueueArr()));
    }
}
