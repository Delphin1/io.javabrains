package io.javabrains;

import java.util.Properties;

/**
 * Created by tsg on 06.12.2016.
 */
public class ClosureExample {
    public static void main(String[] args) {
        int a = 10;
        //final
        int b = 20;
 /*       doProcess(a, new Process() {
            public void process(int i) {
                b = 50;
                System.out.println(i + b);
            }
        });*/
        doProcess(a, i-> System.out.println(a+b));

    }

    public static void doProcess(int i, Process p) {
        p.process(i);

    }

}

interface Process {
    void process(int i);
}
