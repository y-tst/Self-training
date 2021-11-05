package recursion;

public class RecursionForArray {
    public static void main(String[] args) {
        RecForPopulatingFromArray ob = new RecForPopulatingFromArray(10);
        int i;

        for (i=0; i<10; i++){
            ob.values[i] = i;
        }

        ob.printArray(10);

    }
}
