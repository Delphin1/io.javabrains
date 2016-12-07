package io.javabrains.unit3;

import io.javabrains.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tsg on 06.12.2016.
 */
public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dikens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        System.out.println("Using simple for");
        for (int i=0; i < people.size(); i++) {
            System.out.println(people.get(i));

        }
        System.out.println("Using for in");
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println("Using Java8 lambda forEach");
        //people.forEach(p -> System.out.println(p));
        people.forEach(System.out::println);

    }
}
