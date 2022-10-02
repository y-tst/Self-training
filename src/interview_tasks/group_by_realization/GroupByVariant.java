package interview_tasks.group_by_realization;

//    groupBy([6.1, 4.2, 6.3], Math.floor) // -> { '4': [4.2], '6': [6.1, 6.3] }
//    groupBy(['one', 'two', 'three'], 'length') // -> { '3': ['one', 'two'], '5': ['three'] }

import java.util.Map;

public class GroupByVariant {

    public static void main(String[] args) {

        System.out.println();
    }

    public  int apply(MathProcessing p, float floatToProcess){
        return p.roundExecutor(floatToProcess);
    }


}
//
//// определяем свой интерфейс
//  interface NameAndIndexPredicate {
//    public boolean execute(String name, int index);
//  }
//
//    boolean apply(NameAndIndexPredicate p, String name, int index) {
//        return p.execute(name, index);
//    }
//
//    apply((n, i) -> true, "VladD", 1);
//        import java.util.function.*;
//
//// пользуемся готовым интерфейсом
//        boolean apply(BiPredicate<String, Integer> p, String name, int index) {
//        return p.test(name, index);
//        }
//
//        apply((n, i) -> true, "VladD", 1);