public class SimpleNumbers {

    public static void main(String[] args) {

        int maxNumber = 100;
        int reminderOfDevision;

        for (int n = 2; n <= maxNumber; n++) {
            boolean isSimple = true;

            for (int i = 2; i <= n / i; i++) {
                reminderOfDevision = n % i;

                if (reminderOfDevision == 0) {
                    isSimple = false;
                }
            }

            if (isSimple) {
                System.out.println(n + " is simple number!");
            }
        }
    }
}