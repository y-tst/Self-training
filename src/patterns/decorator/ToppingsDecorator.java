package patterns.decorator;

// The decorator class :  It extends Pizza to be
// interchangeable with it toppings decorator can
// also be implemented as an interface
abstract class ToppingsDecorator extends Pizza {
    public abstract String getDescription();
}
