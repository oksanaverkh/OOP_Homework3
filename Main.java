// Добавить Comparable и/или Comparator к приложению, написанному на семинаре(Файлы прикреплены под уроком)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListOfDogs doglist = new ListOfDogs();
        doglist.setDogList(Arrays.asList(new Dog("Sharik", 2, "Shepherd"),
                new Dog("Pashtet", 3, "Pomeranian"),
                new Dog("Pashtet", 1, "Pit bull"),
                new Dog("Polkan", 4, "Dachshund"),
                new Dog("Persik", 2, "Shi-tsu"),
                new Dog("Snezhok", 1, "Pit bull")));

        /**
         * Variant 1 (using Comparator)
         */
        List<Dog> sortedList = new ArrayList<>();
        for (Dog dog : doglist) {
            sortedList.add(dog);
        }

        sortedList.sort(new NameComparator().thenComparing(new AgeComparator()));

        System.out.println("Variant 1: using comparator (sorting by comparison of 2 parameters).");
        for (int i = 0; i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i));
        }

        System.out.println();

        /**
         * Variant 2 (using Comparable)
         */
        System.out.println("Variant 2: using comparable (sorting by age).");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter numbers of dogs out of %d you want to compare:", doglist.getDogList().size());
        System.out.println("\nEnter a number of dog 1: ");
        Integer number1 = sc.nextInt();
        System.out.println("Enter a number of dog 2: ");
        Integer number2 = sc.nextInt();
        sc.close();

        System.out.println(doglist.getDogList().get(number1).toString());
        System.out.println(doglist.getDogList().get(number2).toString());

        if (doglist.getDogList().get(number1).compareTo(doglist.getDogList().get(number2)) == 1) {
            System.out.printf("\nDog number %d is greater", number1);
        } else if (doglist.getDogList().get(number1).compareTo(doglist.getDogList().get(number2)) == -1) {
            System.out.printf("\nDog number %d is greater", number2);
        } else
            System.out.println("Chosen dogs are equal");

    }
}
