package algorithmsAndDataStructures;

public class SimpleFibonacci {


    public static void main(String[] args) {
//        System.out.println(fibNaive(3));
//        System.out.println(fibNaive(5));
//        System.out.println(fibNaive(10));
//        System.out.println(fibNaive(1));

        System.out.println(fibEffective(3));
        System.out.println(fibEffective(5));
        System.out.println(fibEffective(50));
        System.out.println(fibEffective(1));

    }

    private static long fibNaive(int n) {

        if (n <= 1)
            return n;

        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    private static long fibEffective(int n) {

        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 2] + arr[i - 1];

        return arr[n];
    }
}
