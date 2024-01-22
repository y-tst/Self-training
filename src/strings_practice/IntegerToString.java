package strings_practice;

public class IntegerToString {

    /*
    We can convert int to String in java using String.valueOf() and Integer.toString() methods.
    Alternatively, we can use String.format() method, string concatenation operator etc.
     */

    public static void main(String args[]){
        int i=200;
        String s=String.valueOf(i);
        System.out.println(i+100);//300 because + is binary plus operator
        System.out.println(s+100);//200100 because + is string concatenation operator
    }
}
