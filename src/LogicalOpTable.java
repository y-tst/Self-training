public class LogicalOpTable {

    public static boolean p, q;

    public static void main(String args[]) {

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = true;
        q = true;
        printResult();
        p = true;
        q = false;
        printResult();
        p = false;
        q = true;
        printResult();
        p = false;
        q = false;
        printResult();
    }

    public static void printResult() {
        int pp, qq, and, or, excludingOr, not;


        if (p) pp = 1;
        else pp = 0;

        if (q) qq = 1;
        else qq = 0;

        if (p & q) and = 1;
        else and = 0;

        if (p | q) or = 1;
        else or = 0;

        if (p ^ q) excludingOr = 1;
        else excludingOr = 0;

        if (!p) not = 1;
        else not = 0;


//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p & q) + "\t" + (p | q) + "\t");
//        System.out.println((p ^ q) + "\t" + (!p));

        System.out.print(pp + "\t" + qq + "\t");
        System.out.print(and + "\t" + or + "\t");
        System.out.println(excludingOr + "\t" + not);
    }
}
