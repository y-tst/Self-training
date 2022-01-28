package algorithmsAndDataStructures;

public class BubbleSorting {
    
    public static void main(String[] args) {

        int[] someArray = {12, 4, 10, 0, 45, 90, 150, 12, 15, 1, 3, 101, 7, 2};

        sorting(someArray);

        printArray(someArray);
    }

    public static int[] sorting(int[] arrayToSort) {

        boolean check = false;
        int buf;

        while (!check) {

            check = true;

            for (int k = 0; k < arrayToSort.length - 1; k++) {
                if (arrayToSort[k] > arrayToSort[k + 1]) {
                    check = false;
                    buf = arrayToSort[k + 1];
                    arrayToSort[k + 1] = arrayToSort[k];
                    arrayToSort[k] = buf;
                }
            }
        }

        return arrayToSort;
    }

    public static void printArray(int[] arrayToPrint) {

        System.out.println("Sorted array:");

        for (int k = 0; k <= arrayToPrint.length - 1; k++) {
            System.out.println(arrayToPrint[k]);
        }
    }
}
