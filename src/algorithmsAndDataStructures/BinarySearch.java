package algorithmsAndDataStructures;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 10, 12, 22, 58, 64, 87};
        System.out.println("The index of searched number in array: " + binarySearch(a, 58));
    }

    public static int binarySearch(int[] a, int k) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;


            if (k < a[middle])
                high = middle - 1;
            else if (k > a[middle])
                low = middle + 1;
            else return middle;
        }
        return -1;
    }
}
