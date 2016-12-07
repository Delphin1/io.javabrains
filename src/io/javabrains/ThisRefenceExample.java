package io.javabrains;

import org.omg.PortableInterceptor.ServerRequestInfo;

/**
 * Created by tsg on 06.12.2016.
 */
public class ThisRefenceExample {
    public void doPorcess(int i, Process p) {
        p.process(i);
    }



    public static void main(String[] args) {
        ThisRefenceExample thisRefenceExample = new ThisRefenceExample();
        thisRefenceExample.doPorcess(10, i -> {
            System.out.println("i: " + i);
//            System.out.println(this); not work
        });
        /*thisRefenceExample.doPorcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("i: " + i);
                System.out.println(this);
            }

            public String toString() {
                return "Anonymous inner class";
            }
        });*/
    }
}
