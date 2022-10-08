package lambdas.example;

public class PrintExecutor {

    public static void main(String[] args) {

        newPrinter(() -> System.out.println("Lambda probe"));
        newPrinter2((s) -> System.out.println("Lambda probe" + s));

    }

    static void newPrinter(Printer thing) {
        thing.print();
    }

    static void newPrinter2 (PrinterWithParam thing) {
        thing.print2("!");
    }
}
