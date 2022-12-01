package patterns.decorator;

// Concrete pizza classe
public class ChickenFiesta extends Pizza {
    public ChickenFiesta() {
        description = "PeppyPaneer";
    }

    public int getCost() {
        return 100;
    }
}