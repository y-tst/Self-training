package interview_tasks.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FibonacciGeneratorAndAccumulator {

    private static ArrayList<Integer> fiboList = new ArrayList<>();


    public static void main(String[] args) {

        fiboList.add(0, 0);
        fiboList.add(1, 1);

        System.out.println(fiboInvoker(0));
        System.out.println(fiboInvoker(1));
        System.out.println(fiboInvoker(5));
        System.out.println(fiboInvoker(8));
        System.out.println(fiboInvoker(7));
        System.out.println(fiboInvoker(10));
        System.out.println(fiboInvoker(2));
    }

    public static String fiboInvoker(int n) {

        return fibonacciAccumulator(n)
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public static List<Integer> fibonacciAccumulator(int n) {

        System.out.println("Called with: " + n);

        if (n <= 0) {
            System.out.println("Unavailable value");
            return new ArrayList<Integer>();
        } else if (1 <= n && n <= 2) {
            return fiboList.subList(0, n);
        } else if (2 < n && n <= fiboList.size()) {
            System.out.println("No compute");
            return fiboList.subList(0, n);
        } else {

            System.out.println("Accumulated row size: " + fiboList.size());
            System.out.println("Adding " + (n - fiboList.size()) + " missed element to existed row");
            for (int i = fiboList.size(); i < n; i++) {
                fiboList.add(i, (fiboList.get(i - 1) + fiboList.get(i - 2)));
            }
        }

        return fiboList;
    }
}
