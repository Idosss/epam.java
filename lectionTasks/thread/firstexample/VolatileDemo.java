package kz.epam.lessons.thread.firstexample;

import java.awt.*;

public class VolatileDemo {

    public static void main(String[] args) throws InterruptedException {
        Clicker click1 = new Clicker();
        click1.start();
        Thread.sleep(50);

        click1.stopClick();
        click1.join();

        System.out.println("Последний оператор метода main()");
    }
}

class Clickerr extends Thread {
    private int click = 0;
    private volatile boolean running = true;

    public Clickerr() {
    }

    public void run(){
        while (running) {
            click++;

        }
    }
     public void stopClick() {
        running = false;
     }
}
