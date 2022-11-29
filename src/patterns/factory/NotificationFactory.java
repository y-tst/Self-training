package patterns.factory;

/*
Implementation:

    Define a factory method inside an interface.
    Let the subclass implements the above factory method and decides which object to create.
    In Java, constructors are not polymorphic, but by allowing subclass to create an object,
    we are adding polymorphic behavior to the instantiation. In short, we are trying to achieve
    Pseudo polymorphism by letting the subclass to decide what to create, and so this Factory method
    is also called a virtual constructor.
 */

public class NotificationFactory {

    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel " + channel);
        }
    }
}
