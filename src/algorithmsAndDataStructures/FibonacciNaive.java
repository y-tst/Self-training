package algorithmsAndDataStructures;

public class FibonacciNaive {

    public static void main(String[] args) {

        System.out.println(fibNaive(0));
        System.out.println(fibNaive(5));
        System.out.println(fibNaive(10));
    }

  private static long fibNaive(int n){
      if (n <= 1) return n;
      return fibNaive(n - 1) + fibNaive(n - 2);
  }
}