package com.thread.example3;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {
    // Add any necessary member variables here
    List<Runnable> myTasks = new ArrayList<>();

    /*
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        // Complete your code here
        this.myTasks = tasks;
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        // complete your code here
        for (Runnable tasks : myTasks){
            tasks.run();
        }
}
}
