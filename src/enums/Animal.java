package enums;

public enum Animal {
    DOG("Собака"),
    CAT("Кішка"),
    FROG("Жаба");

    public String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Animal " + this.name() + " has translation '" + translation + "'";
    }
}
