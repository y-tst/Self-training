package streams;

import javafx.collections.transformation.SortedList;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        System.out.println("Task 1");

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

//        Task 2a
//  Выведите все елементы которые есть в обоих списках
//        Task 2b
//  Выведите все елементы первого списка, которых нет во втором
        String[] l1 = {"White", "Black", "Red"};
        String[] l2 = {"Red", "Green"};

        List<String> list1 = Arrays.asList(l1);
        List<String> list2 = Arrays.asList(l2);

        System.out.println();
        System.out.println("Task 2a");
        list1.stream()
                .filter(s -> list2.indexOf(s) != -1)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Task 2b");
        list1.stream()
                .filter(s -> list2.indexOf(s) == -1)
                .forEach(System.out::println);


//        Task 3
// Удалить из списка все дублирующиеся значения (оставить только уникальные)

        Integer[] numbers = {1, 2, 5, 3, 5, 2, 1, 1, 4, 7, 3, 2};

        List<Integer> nums = Arrays.asList(numbers);

        System.out.println();
        System.out.println("Task 3");
        nums.stream()
//                .sorted()
                .distinct()
                .forEach(System.out::print);

        System.out.println();
        System.out.println();
        System.out.println("Task 3 v2 - other way to print out");

        Stream<Integer> stream = Arrays.stream(numbers);
        System.out.println(stream.distinct().collect(Collectors.toList()));


//        Task 4
// Сделать реверс числа (из 12345 в 54321)  num = 12345

        int num = 12345333;

        System.out.println();
        System.out.println("Task 4 v1 - via StringBuilder");

        char[] charArrayOfNum = Integer.toString(num).toCharArray();
        StringBuilder reversedStringNum = new StringBuilder();

        for (int i = charArrayOfNum.length; i > 0; i--) {
            reversedStringNum.append(charArrayOfNum[i - 1]);
        }
        System.out.println(Integer.parseInt(reversedStringNum.toString()));


        System.out.println();
        System.out.println("Task 4 v2");


        /*

        !  int[] to Integer[] java

        int[] data = {1,2,3,4,5,6,7,8,9,10};

  To boxed array:
Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
Integer[] ever = IntStream.of( data ).boxed().toArray( Integer[]::new );

  :To boxed list
List<Integer> you  = Arrays.stream( data ).boxed().collect( Collectors.toList() );
List<Integer> like = IntStream.of( data ).boxed().collect( Collectors.toList() );


- REVERCE an array:
 Integer [] arr = {10, 30, 20, 0, 50};
 Collections.reverse(Arrays.asList(arr));
 System.out.println(Arrays.asList(arr));

- List of ints into int array
int[] example1 = list.stream().mapToInt(i->i).toArray();
int[] example2 = list.stream().mapToInt(Integer::intValue).toArray();

         */

//        int[] numArray = Integer.toString(num).chars().map(c -> c - '0').toArray();
//        Integer[] numArray1 = Arrays.stream(numArray).boxed().toArray(Integer[]::new);

        List<Integer> digits = Integer.toString(num)
                .chars()
                .map(Character::getNumericValue)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Before list from int: " + digits + ", class is - " + digits.getClass());

        Collections.reverse(digits);
        System.out.println("After list from int: " + digits);

        StringBuilder stringFromList = new StringBuilder();
        digits.stream().forEach(d -> stringFromList.append(d));

        System.out.println("String of reversed int -" + stringFromList.toString());

        int reversedNumber = Integer.parseInt(stringFromList.toString());
        System.out.println("Reversed int - " + reversedNumber);


//
//        Task 5
// Map<String, Map<String, Integer>> d2 = new HashMap<>(d1);
//


//        Task 6
//        There is a list of persons
        List<Person> team = Arrays.asList(
                new Person("Nikita", 21, Occupation.CEO),
                new Person("Ruslan", 22, Occupation.CEO),
                new Person("Dyadya Vanya", 60, Occupation.CLEANING_LADY),
                new Person("Bob Martin", 46, Occupation.DEVELOPER),
                new Person("Fred Brooks", 47, Occupation.DEVELOPER),
                new Person("Maks", 21, Occupation.CEO)
        );

//   task 6.1 - get number of CEOs
        Long ceo_num = team.stream()
                .filter(p -> p.occupation.equals(Occupation.CEO))
                .count();
        System.out.println("Number of CEOs - " + ceo_num);

//   task 6.2 - get max age in team
        Optional<Integer> max_age = team.stream()
                .map(p -> p.age)
                .max(Integer::compareTo);
        System.out.println("Max age in team - " + max_age);
//        System.out.println("Max age in team (w/o Optional) - " + max_age);

//   task 6.3 - get all team members per position, except CEO
        Map<Occupation, List<Person>> positions = team.stream()
                .filter(person -> !person.occupation.equals(Occupation.CEO))
                .collect(Collectors.groupingBy(Person::getOccupation));

        System.out.println(positions);


//   task 6.4 - sort all team members per age
        List<Person> teamSortedByAge = team.stream()
                .sorted((e1, e2) -> Double.compare(e1.getAge(), e2.getAge()))
                .collect(Collectors.toList());

        for (Object person : teamSortedByAge) {
            System.out.println(person.toString());
        }

        // v2
        List<Person> teamSortedByAgeV2 = team.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        for (Object person : teamSortedByAgeV2) {
            System.out.println(person.toString());
        }


        // flatMap() example:

        List<List<Integer>> number = new ArrayList<>();

// adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));

        System.out.println("List of list-" + number);

        // using flatmap() to flatten this list
        List<Integer> flatList = number.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

// printing the list
        System.out.println("List generate by flatMap-" + flatList);
    }


    static class Person {
        private final String firstName;
        private String lastName;
        private Occupation occupation;
        private final int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Person(String firstName, int age, Occupation occupation) {
            this.firstName = firstName;
            this.age = age;
            this.occupation = occupation;
        }

        @Override
        public String toString() {
            return "First Name: " + firstName +
                    "  Last Name: " + lastName +
                    "  Age: " + age +
                    "  Occupation: " + occupation;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public Occupation getOccupation() {
            return occupation;
        }

        public int getAge() {
            return age;
        }
    }

    public enum Occupation {
        CEO,
        CLEANING_LADY,
        DEVELOPER
    }
}
