package org.example;

public class HiloSimple extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("En el hilo...");
        }
    }
}

