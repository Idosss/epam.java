package kz.epam.lessons.thread.firstexample;

public class DeamonInspector {

    public static void main(String[] args) {
        System.out.println("Start main thread.");

        DeamonThread deamon = new DeamonThread();
        deamon.setDaemon(true);
        deamon.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End main thread.");
    }
}
