package TestQueue;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        GenericQueue<String> queue = new GenericQueue<>();
        queue.enqueue("Ha");
        queue.enqueue("bao");
        queue.enqueue("hung");
        while (!queue.isEmpty())
            System.out.print(queue.dequeue() + " ");


    }
}
