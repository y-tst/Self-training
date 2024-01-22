package strings_practice;

public class ConvertStringToInt {

    /*
We can convert String to an int in java using Integer.parseInt() method.
To convert String into Integer, we can use Integer.valueOf() method which returns
instance of Integer class.
     */

    public static void main(String args[]){
        String s="200";
//Converting String into int using Integer.parseInt()
        int i=Integer.parseInt(s);
        System.out.println(s+100);//200100, because "200"+100, here + is a string concatenation operator
        System.out.println(i+100);//300, because 200+100, here + is a binary plus operator
    }
}
