package lambdas;

import java.util.*;
import java.util.stream.Collectors;

public class simpleExample {
    public static void main(String[] args) {
//        Printer printer = new Printer() {
//            @Override
//            public void print(String msg) {
//                System.out.println(msg);
//            }
//        };
//        printer.print("Hi!..");


        Printer lambdaPrinter = (msg) -> System.out.println(msg);
//        lambdaPrinter.print("Hi Lambda!");


        Printer methodReferencePrinter = System.out::println;
//        methodReferencePrinter.print("Hi Method Reference!");

        Map<String, Printer> printerHub = new HashMap<>();

        printerHub.put("Lambda", lambdaPrinter);
        printerHub.put("Second", m -> {
            System.out.println("-=-=-=-");
            System.out.println(m);
            System.out.println("-=-=-=-");
        });

        printerHub.get("Lambda").print("Hello Lambda");
        printerHub.get("Second").print("Hi there!");

        List<String> names = Arrays.asList("James", "Rokki", "Robert", "Brian", "Sally", "Rene", "Ron", "Roger");

        for (String name : names) {
            System.out.println(name);
        }

        names.stream().forEach(n -> System.out.println(n));

        names
                .stream()
                .filter(n -> n.startsWith("R"))
                .forEach(n -> System.out.println(n));

        List<String> filteredNames =
                names
                        .stream()
                        .filter(n -> n.startsWith("R"))
                        .sorted(String::compareToIgnoreCase)
                        .collect(Collectors.toList());

        System.out.println(filteredNames);

//        filteredNames.sort(String::compareToIgnoreCase);
//        System.out.println(filteredNames);

    }

    interface Printer {
        void print(String msg);
    }
}
