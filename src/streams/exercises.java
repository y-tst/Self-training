package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercises {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Peter", "Patterson", 21));
        personList.add(new Person("P", "Walker", 31));
        personList.add(new Person("Steve", "Runner", 41));
        personList.add(new Person("Arnold", "", -1));
        personList.add(new Person(" ", "Stevenson", 19));
        personList.add(new Person("Arnold", "Stevenson", 19));
        personList.add(new Person("Bold", "452venson", 10));
        personList.add(null);
        personList.add(new Person("Aaron", "Bortnicker", 18));
        personList.add(new Person("Aaron", "Bortnicker", 1008));


        //Task 1
//Вывести только нормальные значения

        personList.stream()
                .filter(p -> p != null
                        && p.firstName != null
                        && !p.firstName.isEmpty()
                        && p.firstName.matches("[a-zA-Z]+")
                        && p.lastName != null
                        && !p.lastName.isEmpty()
                        && p.lastName.matches("[a-zA-Z]+")
                        && (0 < p.age && p.age < 150)
                ).forEach(System.out::println);

//        Task 2
//  Выведите все елементы первого списка, которых нет во втором
        String[] l1 = {"White", "Black", "Red"};
        String[] l2 = {"Red", "Green"};




//        Task 3
// Удалить из списка все дублирующиеся значения (оставить только уникальные)
//        Integer[] numbers = {1, 2, 5, 3, 5, 2, 1, 1, 4, 7, 3, 2};
//
//        Task 4
// Сделать реверс числа (из 12345 в 54321)  num = 12345
//
//        Task 5
// Map<String, Map<String, Integer>> d2 = new HashMap<>(d1);
//
//        Task 6
//        List<Person> team = Arrays.asList(
//        new Person("Nikita", 21, Occupation.CEO),
//        new Person("Ruslan", 22, Occupation.CEO),
//        new Person("Dyadya Vanya", 60, Occupation.CLEANING_LADY),
//        new Person("Bob Martin", 46, Occupation.DEVELOPER),
//        new Person("Fred Brooks", 47, Occupation.DEVELOPER),
//        new Person("Maks", 21, Occupation.CEO)
//        );
//        // task 3 - get all team members per position, except CEO
//        Map<Occupation, List<Person>> positions = team.stream()
//// task 1 - get number of CEOs
//        Long ceo_num = team.stream()
//// task 2 - get max age in team
//        Integer max_age = team.stream()

    }

    static class Person {
        private final String firstName;
        private final String lastName;
        private final int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Firs Name: " + firstName +
                    "  Last Name: " + lastName +
                    "  Age: " + age;
        }
    }


}
