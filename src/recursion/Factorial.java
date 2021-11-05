package recursion;

public class Factorial {

    int fact(int n){
        int result;

        if (n == 1) return  1;

        result = n * fact(n - 1 );
        System.out.println("n = " + n +", result = " + result);

        return  result;
    }
}
