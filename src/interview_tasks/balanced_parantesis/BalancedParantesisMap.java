package interview_tasks.balanced_parantesis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BalancedParantesisMap {

    public static void main(String[] args) {

        System.out.println(isBalanced("(x + y) - (4)"));
        System.out.println(isBalanced("(((10 ) ()) ((?)(:)))"));
        System.out.println(isBalanced("[{()}]"));
        System.out.println(isBalanced(")[{()}]"));
        System.out.println(isBalanced("(50)("));
        System.out.println(isBalanced("[{]}"));

    }

    public static boolean isBalanced(String sourceString) {

        String start = "([{";
        String finish = ")]}";

        Map<Character, Character> parantesisMatcher = new HashMap<>();
        parantesisMatcher.put('(', ')');
        parantesisMatcher.put('[', ']');
        parantesisMatcher.put('{', '}');

        List<Character> characters = new ArrayList<>();

        if (finish.contains(sourceString.substring(0, 1))) {
            return false;
        }

        for (int i = 0; i < sourceString.length(); i++) {

            Character currentChar = sourceString.charAt(i);

            if (start.contains(currentChar.toString())) {
                characters.add(currentChar);
            } else if (finish.contains(currentChar.toString())) {
                if (parantesisMatcher.get(characters.get(characters.size() - 1)).equals(currentChar)) {
                    characters.remove(characters.size() - 1);
                } else return false;
            }
        }
        return characters.isEmpty();
    }
}

