package com.thread.example3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(() ->{
                System.out.println("Hello World");
            System.out.println(Thread.currentThread().getName());
        });

        Thread t2 = new Thread(() ->{
            System.out.println("Hello World 2");
        });

        Thread t3 = new Thread(() ->{
           t1.setName("Thread 1 Name");
        });

        List<Runnable> tasks = new ArrayList<>();
        tasks.add(t1);
        tasks.add(t2);
        tasks.add(t3);

        MultiExecutor executor = new MultiExecutor(tasks);

        executor.executeAll();
    }

}
