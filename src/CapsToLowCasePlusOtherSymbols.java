import java.io.IOException;

public class CapsToLowCasePlusOtherSymbols {
    public static void main(String[] args) throws IOException {
        char input;
        char output;
        char ignore;
        int count = 0;

        do {
            System.out.print("Input any symbol, pls (for letters the register will be changed, Exit - '.'): ");
            input = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }
            while (ignore != '\n');


            if (input == '.') {
                System.out.println("You've pressed '.', process is finished");
                System.out.println("You've inputted " + count + " letters, for which the register was changed");
                break;
            } else if (input >= 65 & input <= 90) {
                output = (char) (input + 32);
                count += 1;
                System.out.println("LowCase - " + output);
                System.out.println("Try again. Exit - '.'");
            } else if (input >= 97 & input <= 122) {
                output = (char) (input - 32);
                count += 1;
                System.out.println("CAPS - " + output);
                System.out.println("Try again. Exit - '.'");
            } else System.out.println("You've inputted " + input);
        }
        while (input != '.');
    }
}
