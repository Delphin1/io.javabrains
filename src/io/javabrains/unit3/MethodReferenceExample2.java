package io.javabrains.unit3;

import io.javabrains.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by tsg on 06.12.2016.
 */
public class MethodReferenceExample2 {
    public static void main(String[] args) {

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
       //performConditionally(people, p -> true, p -> System.out.println(p));
        performConditionally(people, p -> true, System.out::println);   //p-> method(p)





        //Thread t = new Thread(() -> printMessage());
        /*Thread t = new Thread(MethodReferenceExample2::printMessage);
        t.start();
*/
    }

    public static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }

    }

    public static void printMessage() {
        System.out.println("Hello!");

    }
}
