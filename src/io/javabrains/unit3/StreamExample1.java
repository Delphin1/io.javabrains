package io.javabrains.unit3;

import io.javabrains.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by tsg on 06.12.2016.
 */
public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dikens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        long i = people.parallelStream()
                .filter(p -> p.getFirstName().startsWith("C"))
                //.forEach(System.out::println)
                .count();
        System.out.println(i);
        //Stream<Person> stream = people.stream();

    }
}
