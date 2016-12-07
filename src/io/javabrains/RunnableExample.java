package io.javabrains;

/**
 * Created by tsg on 29.11.2016.
 */
public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed insid Runnable");
            }
        });

        myThread.run();


        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda"));

        myLambdaThread.run();
    }

}
