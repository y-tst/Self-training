package interview_tasks.arraysItems_similarity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComparingArraysItems {

//    console.log(arraySubset([2, 1, 3], [1, 2, 3])) // -> true
//    console.log(arraySubset([2, 1, 1, 3], [1, 2, 3])) // -> true
//    console.log(arraySubset([1, 1, 1, 3], [1, 3, 3])) // -> false
//    console.log(arraySubset([1, 2], [1, 2, 3])) // -> false

    public static void main(String[] args) {
        System.out.println(isFirstArrayIncludesItemsFromSecondArray(new int[]{2, 1, 3}, new int[]{1, 2, 3}));
        System.out.println(isFirstArrayIncludesItemsFromSecondArray(new int[]{2, 1, 1, 3}, new int[]{1, 2, 3}));
        System.out.println(isFirstArrayIncludesItemsFromSecondArray(new int[]{1, 1, 1, 3}, new int[]{1, 3, 3}));
        System.out.println(isFirstArrayIncludesItemsFromSecondArray(new int[]{1, 2}, new int[]{1, 2, 3}));
        System.out.println(isFirstArrayIncludesItemsFromSecondArray(new int[]{2, 1, 1, 3}, new int[]{5}));
  }

    public static boolean isFirstArrayIncludesItemsFromSecondArray(int[] arr1, int[] arr2){

        if (arr1.length < arr2.length)
            return  false;

//  simple variant How to convert int[] into List<Integer> in Java:
//
//        int[] ints = {1, 2, 3};
//        List<Integer> intList = new ArrayList<Integer>(ints.length);
//        for (int i : ints)
//        {
//            intList.add(i);
//        }

        // via streams:

        List<Integer> arrayList = Arrays.stream(arr1).boxed().collect(Collectors.toList());

        for (int i = 0; i < arr2.length; i++)
        {
            if (arrayList.contains(arr2[i])){
               arrayList.remove(arrayList.indexOf(arr2[i]));
            }
            else
                return  false;
        }
        return  true;
    }
}
