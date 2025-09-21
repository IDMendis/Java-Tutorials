
import java.util.Queue;
import java.util.Collections;

public class PriorityQueues {
    public static void main(String[] args) {
        Queue<Double> priorityQueue = new java.util.PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.add(5.5);
        priorityQueue.add(1.1);
        priorityQueue.add(3.3);
        priorityQueue.add(4.4);
        priorityQueue.add(2.2);

        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
