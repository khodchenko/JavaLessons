package l53_Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        Queue queue1 = new PriorityQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while (queue.size()>0){
            System.out.println(queue.poll());
        }

    }
}
