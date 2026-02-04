package com.thread.example8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Long> inputNumbers = Arrays.asList(0L, 3435L, 35273L, 432L, 4353L, 1213L, 23L, 3453L, 43434L);

        List<FactorialThread> threads = new ArrayList<>();

        for(long numbers : inputNumbers){
            threads.add(new FactorialThread(numbers));
        }

        for(Thread thread : threads){
            thread.setDaemon(true);
            thread.start();
        }

        for(Thread thread : threads){
            thread.join(2000);
        }

        for(int i = 0 ; i < inputNumbers.size(); i++){
            FactorialThread thread = threads.get(i);
            if (thread.isFinished()){
                System.out.println("Factorial of " + inputNumbers.get(i) + "is" + thread.getResult());
            }
            else{
                System.out.println("The calculation for " + inputNumbers.get(i) + " is still in progress");
            }
        }

    }
}
