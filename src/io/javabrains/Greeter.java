package io.javabrains;

/**
 * Created by tsg on 29.11.2016.
 */
public class Greeter {
    public void greet(Greeting greeting) {
        //System.out.println("Hello word!");
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        //HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        //greeter.greet(helloWorldGreeting);
        //greeter.greet();

        Greeting lambdaGreeting = () -> System.out.println("Hello Word !!");

        lambdaGreeting.perform();

    }
}


