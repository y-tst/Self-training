package patterns.decorator;

/*
Definition:
The decorator pattern attaches additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality.
    Each component can be used on its own or may be wrapped by a decorator.
    Each decorator has an instance variable that holds the reference to component it decorates(HAS-A relationship).
    The ConcreteComponent is the object we are going to dynamically decorate.
 */

// Java program to demonstrate Decorator
// pattern

// Abstract Pizza class (All classes extend
// from this)
abstract class Pizza {
    // it is an abstract pizza
    String description = "Unknown Pizza";

    public String getDescription() {
        return description;
    }

    public abstract int getCost();
}