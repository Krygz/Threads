package com.thread.example2;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new NewThread();
        t1.start();
        Thread t2 = new Thread(new Thread2());
        t2.start();
    }


    public static class NewThread extends Thread {
        @Override
        public void run() {
            System.out.println("This is a new thread");
           }
    }

    public static class Thread2 implements Runnable {
        @Override
        public void run() {
            System.out.println("This is a thread2");
        }
    }
}
