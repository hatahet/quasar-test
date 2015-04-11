package com.mycompany.app;

import co.paralleluniverse.fibers.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        System.out.println(Fiber.DEFAULT_STACK_SIZE);

        new Fiber<Void>() {
            @Override protected Void run() throws SuspendExecution, InterruptedException {
                System.out.println("Hello from fiber");
                return null;
            }
        }.start();

        Thread.sleep(2000);
    }
}
