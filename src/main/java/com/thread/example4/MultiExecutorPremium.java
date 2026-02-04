package com.thread.example4;

import java.util.List;

public class MultiExecutorPremium {

    List<Runnable> threads;

    public MultiExecutorPremium(List<Runnable> threads) {
        this.threads = threads;
    }

    public void executeAll(){
        for(Runnable r : threads){
            r.run();
        }
    }
}
