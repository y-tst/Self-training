package patterns.decorator;

// Concrete pizza classe
class Margherita extends Pizza {
    public Margherita() {
        description = "Margherita";
    }

    public int getCost() {
        return 100;
    }

    ;
}
