package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by tsg on 02.12.2016.
 */
public class StandartFunctionalInterfacesExample {
    public static void main(String[] args) {
        System.out.println("Start main");

        List<Person> people = Arrays.asList(
            new Person("Charles", "Dikens", 60),
            new Person("Lewis", "Carroll", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlotte", "Bronte", 45),
            new Person("Matthew", "Arnold", 39)
        );
        // Step 1: Sort list by last name  (lambda realization)
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a method that prints all elements in the list
        System.out.println("--prints all elements in the list");
        //printAll(people);
        performConditionally(people, p -> true, p -> System.out.println(p));

        // Step 3: Create a method that prints all people that name last name beginning with C
        System.out.println("--prints all people that name last name beginning with C");
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));


        System.out.println("--prints all people that name first name beginning with C");
        performConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));



        System.out.println("Stop main");
    }

/*    public static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }*/

    public static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }

    }

/*
    interface Condition {
        boolean test(Person p);
    }
*/

}
