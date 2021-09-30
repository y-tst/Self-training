import java.io.IOException;

public class BackspaseCounter {
    public static void main(String[] args) throws IOException {

        char input;
        char ignore;
        int n = 0;

        System.out.println("Type something (to stop input '.'): ");

        do {
            input = (char) System.in.read();
            if (input == ' ') n += 1;
        }
        while (input != '.');

        System.out.println("You've typed '.', that's why process was terminated");
        System.out.println("You've clicked backspase for " + n + " times");

    }
}
