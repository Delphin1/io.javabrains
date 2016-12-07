package io.javabrains;

import java.util.function.BiConsumer;

/**
 * Created by tsg on 06.12.2016.
 */
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int [] someNumbers = {1,2,3,4};
        int key = 0;

        process(someNumbers, key, wrapperLambda((v, k) ->  System.out.println(v / k)));
    }

    public static void process(int [] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumbers) {
            consumer.accept(i, key);
            //System.out.println(i + key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        //return (v,k) -> System.out.println(v + k);
        return (v,k) -> {
            //System.out.println("Execute form wrapper");
            try {
                consumer.accept(v,k);
            }
            catch (ArithmeticException e) {
                System.out.println("Divide by 0 in wrapper");
            }

        };
    }

}
