package regular_expressions;

/*
Написать программу, выполняющую поиск в строке
шестнадцатеричных чисел, записанных по правилам Java,
с помощью регулярных выражений и выводящую их на страницу.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchXNumbers {

    public static void main(String[] args) {

        int value = 0X25f5;

        String regex = "0[Xx][0-9a-fA-F]+";
        String input = "dfsgadf 0X23f1 oihjoijhoi 0x12 hohoih 0XAB";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
