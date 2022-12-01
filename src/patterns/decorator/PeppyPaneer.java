package patterns.decorator;

// Concrete pizza classe
class PeppyPaneer extends Pizza {
    public PeppyPaneer() {
        description = "PeppyPaneer";
    }

    public int getCost() {
        return 100;
    }
}