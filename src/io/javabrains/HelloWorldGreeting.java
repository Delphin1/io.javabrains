package io.javabrains;

/**
 * Created by tsg on 29.11.2016.
 */
public class HelloWorldGreeting implements Greeting {


    @Override
    public void perform() {
        System.out.println("Hello word!");
    }
}
