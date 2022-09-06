package interview_tasks.balanced_parantesis;

import interview_tasks.anagram_check.Anagram;

import java.util.Collections;
import java.util.List;

public class BalancedParantesis {

//    (isBalanced('(x + y) - (4)')) // -> true
//    (isBalanced('(((10 ) ()) ((?)(:)))')) // -> true
//    (isBalanced('[{()}]')) // -> true
//    (isBalanced('(50)(')) // -> false
//    (isBalanced('[{]}')) // -> false

    public static void main(String[] args) {

        System.out.println(isBalanced("(x + y) - (4)"));
        System.out.println(isBalanced("(((10 ) ()) ((?)(:)))"));
        System.out.println(isBalanced("[{()}]"));
        System.out.println(isBalanced("(50)("));
        System.out.println(isBalanced("[{]}"));

    }

    public static boolean isBalanced(String sourceString) {

        char par1open = '(';
        char par1close = ')';
        char par2open = '[';
        char par2close = ']';
        char par3open = '{';
        char par3close = '}';

        List<Character> charList = Anagram.convertStringToCharList(sourceString);

        int openedPars1 = 0;
        int closedPars1 = 0;
        int openedPars2 = 0;
        int closedPars2 = 0;
        int openedPars3 = 0;
        int closedPars3 = 0;

        for (int i = 0; i < sourceString.length(); i++) {

            if (charList.get(i).equals(par1open)) {
                openedPars1++;
                List<Character> subList1 = charList.subList(charList.indexOf('('), charList.size());
                if (subList1.contains(')')) {
                    List<Character> subSubList = subList1.subList(charList.indexOf('('), charList.indexOf(')') + 1);
                    if (subSubList.contains('[')) {
                        if (subSubList.contains(']') && (subSubList.indexOf(']') < subSubList.indexOf('['))) {
                            return false;
                        } else if (subSubList.indexOf(']') < subSubList.indexOf('[')) {
                            return false;
                        }


                    } else if (subSubList.contains('}')) {
                        if (!subSubList.contains('{')) {
                            return false;
                        } else if (subSubList.indexOf('}') < subSubList.indexOf('{')) {
                            return false;
                        }
                    }
                } else if (charList.get(i).equals(par1close)) {
                    closedPars1++;
                }


            } else if (charList.get(i).equals(par2open)) {
                openedPars2++;
                List<Character> subList2 = charList.subList(charList.indexOf('['), charList.size());
                if (subList2.contains(']')) {
                    List<Character> subSubList = subList2.subList(charList.indexOf('['), charList.indexOf(']'));
                    if (subSubList.contains('(')) {
                        if (!subSubList.contains('(')) {
                            return false;
                        } else if (subSubList.indexOf(')') < subSubList.indexOf('(')) {
                            return false;
                        }
                    } else if (subSubList.contains('}')) {
                        if (!subSubList.contains('{')) {
                            return false;
                        } else if (subSubList.indexOf('}') < subSubList.indexOf('{')) {
                            return false;
                        }
                    }
                } else if (charList.get(i).equals(par2close)) {
                    closedPars2++;
                }


            } else if (charList.get(i).equals(par3open)) {
                openedPars3++;
                List<Character> subList3 = charList.subList(charList.indexOf('{'), charList.size());
                if (subList3.contains('}')) {
                    List<Character> subSubList = subList3.subList(charList.indexOf('{'), charList.indexOf('}'));
                    if (subSubList.contains('(')) {
                        if (!subSubList.contains('(')) {
                            return false;
                        } else if (subSubList.indexOf(')') < subSubList.indexOf('(')) {
                            return false;
                        }
                    } else if (subSubList.contains('[')) {
                        if (!subSubList.contains('[')) {
                            return false;
                        } else if (subSubList.indexOf(']') < subSubList.indexOf('[')) {
                            return false;
                        }
                    }
                } else if (charList.get(i).equals(par3close)) {
                    closedPars3++;
                }
            }

            // ??? not work correctly - need the investigation
//            switch (charList.get(i)){
//                case 40: openedPars1++;
//                case 41: closedPars1++;
//                case 91: openedPars2++;
//                case 93: closedPars2++;
//                case 123: openedPars3++;
//                case 125: closedPars3++;
//            }

            if ((openedPars1 == closedPars1) && (openedPars2 == closedPars2) && (openedPars3 == closedPars3)) {
                return true;
            } else return false;
        }
        return false;
    }
}