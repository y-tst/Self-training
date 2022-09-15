package interview_tasks.queue_realisation;

import java.util.ArrayList;
import java.util.List;

public class QueueViaHashTable {

    public static void main(String[] args) {

        TestQueue.enqueue(10);
        TestQueue.enqueue(20);
        TestQueue.enqueue(30);

        System.out.println((TestQueue.list);


    }

    private static List<Integer> list = new ArrayList<>();
    private static int first = 0;
    private static int last = 0;

    public static class  TestQueue {

       static void  enqueue(int item){
           list.set(last, item);
           last++;
       }

       static void dequeue(){
           if (list.isEmpty())  {
               return;
           }
           list.remove(first);
       }

       static int size(){
           return last;
       }
    }
}
