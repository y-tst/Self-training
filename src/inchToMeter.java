public class inchToMeter {

    public static void main(String[] args) {
        int currentInch = 1;
        double inchToMeterDevider = 39.37;

        for (int foot = 0; foot < 12; foot++) {
            System.out.println("Inch to meter for " + foot + " - " + (foot + 1) + " foot(s):");

            for (int counter = 0; counter < 12; counter++) {
                System.out.println(currentInch + " inch(es) is equal " + (currentInch / inchToMeterDevider) + " meters");
                currentInch = currentInch + 1;
            }
            System.out.println();
        }
    }
}