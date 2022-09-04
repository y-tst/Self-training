package interview_tasks.most_fequent_stringIn_array;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentString {

//    Какая строка встречается чаще всего
//    Напишите функцию, которая принимает массив строк и возвращает самую частовстречающуюся
//    строку в этом массиве
//    Если таких строк несколько, то нужно вернуть первую, идя слева на право.
//    **Input**: String[]
//    **Output**: String
//    function highestFrequency(array) {
//        // todo
//    }
//
//            console.log(highestFrequency([""a"", ""b"", ""c"", ""c"", ""d"", ""e""])) // -> c
//            console.log(highestFrequency([""abc"", ""def"", ""abc"", ""def"", ""abc""])) // -> abc
//            console.log(highestFrequency([""abc"", ""def""])) // -> abc
//            console.log(highestFrequency([""abc"", ""abc"", ""def", ""def"", ""def"", ""ghi"", ""ghi"", ""ghi"", ""ghi"" ])) // -> ghi

    static String[] str1 = {"a", "b", "c", "c", "d", "e"};
    static String[] str2 = {"abc", "def", "abc", "def", "abc"};
    static String[] str3 = {"abc", "def"};
    static String[] str4 = {"abc", "abc", "def", "def", "def", "ghi", "ghi", "ghi", "ghi"};

    public static void main(String[] args) {

        System.out.println(mostFrequent(str1));
        System.out.println(mostFrequent(str2));
        System.out.println(mostFrequent(str3));
        System.out.println(mostFrequent(str4));
    }

    static String mostFrequent(String[] inputString) {

        String mostFrequentString = new String();
        int maxQuantity = 0;

        Map<String, Integer> workingMap = new HashMap<>();

        for (String s : inputString) {
            if (workingMap.containsKey(s)) {
                workingMap.put(s, workingMap.get(s) + 1);
//                mostFrequentString = inputString[i];
//                maxQuantity = workingMap.get(inputString[i]) + 1;
            } else {
                workingMap.put(s, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : workingMap.entrySet()) {
            if (entry.getValue() > maxQuantity){
                maxQuantity = entry.getValue();
                mostFrequentString = entry.getKey();
            }

        }

        return mostFrequentString;
    }

}