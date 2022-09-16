package interview_tasks.queue_realisation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QueueViaHashTable {

    private static List<Integer> list = new ArrayList<>();
    private static int first = 0;
    private static int last = 0;

    public static void main(String[] args) {

        TestQueue.enqueue(10);
        TestQueue.enqueue(20);
        TestQueue.enqueue(30);

        System.out.println(list.stream().map(Object::toString).collect(Collectors.joining(", ")));

        TestQueue.dequeue();

        System.out.println(list.stream().map(Object::toString).collect(Collectors.joining(", ")));

        System.out.println("Queue size: " + TestQueue.size());


    }

    public static class TestQueue {

        static void enqueue(int item) {
            list.add(last, item);
            last++;
        }

        static void dequeue() {
            if (list.isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            int firstQueueItem = list.get(first);
            list.remove(first);
            last--;

            System.out.println("Removed element: " + firstQueueItem);
        }

        static int size() {
            return last;
        }
    }
}
