package regular_expressions;

/*
Написать программу, проверяющую, является ли введённая
строка адресом почтового ящика.
В названии почтового ящика разрешить использование только
букв, цифр и нижних подчёркиваний, при этом оно должно
начинаться с буквы.
Возможные домены верхнего уровня: .org .com
 */

import java.util.regex.Pattern;

public class EmailValidation {

    public static void main(String[] args) {

        String regex = "[a-zA-Z]\\w*@\\w{3,}\\.(org|com)";
        String input = "1a23@ljjlkj.com";
        String input1 = "abc@ljjlkj.com";
        String input2 = "ab@gmail.com";
        String input3 = "ab123@gmail.com";
        System.out.println(Pattern.matches(regex, input));
        System.out.println(Pattern.matches(regex, input1));
        System.out.println(Pattern.matches(regex, input2));
        System.out.println(Pattern.matches(regex, input3));

    }
}
