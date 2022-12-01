package patterns.decorator;

// Concrete toppings class
class Barbeque extends ToppingsDecorator {
    // we need a reference to obj we are decorating
    Pizza pizza;

    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Barbeque ";
    }

    public int getCost() {
        return 90 + pizza.getCost();
    }
}
