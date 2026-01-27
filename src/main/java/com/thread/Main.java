package com.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread newThread = new NewThread();

        newThread.start();
    }

    private static class  NewThread extends Thread {
        @Override
        public void run() {
            //Code that executes on the new thread
            System.out.println("Hello from " + this.getName());
        }
    }
}