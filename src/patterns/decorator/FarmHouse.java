package patterns.decorator;

// Concrete pizza classe
class FarmHouse extends Pizza {
    public FarmHouse() {
        description = "FarmHouse";
    }

    public int getCost() {
        return 200;
    }
}