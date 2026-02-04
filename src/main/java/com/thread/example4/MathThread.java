package com.thread.example4;

public abstract class MathThread extends Thread {
    int randomNumber1;
    int randomNumber2;

    public MathThread(int randomNumber1, int randomNumber2) {
        this.randomNumber1 = randomNumber1;
        this.randomNumber2 = randomNumber2;
    }
}
