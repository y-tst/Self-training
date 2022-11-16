package enums;

public class Test {

    public static void main(String[] args) {
        Animal animal = Animal.DOG;

        System.out.println(animal.getTranslation());
        System.out.println(animal);
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

        Animal cat = Animal.CAT;
        System.out.println(cat.ordinal()); // - returns index of element in enum


    }
}
