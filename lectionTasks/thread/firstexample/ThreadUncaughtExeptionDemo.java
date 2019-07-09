package kz.epam.lessons.thread.firstexample;

public class ThreadUncaughtExeptionDemo {

    public static void main(String[] args) {
        Thread t = new Thread(new SimpleThread());
        t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

            public void uncaughtException (Thread t, Throwable e) {
                System.out.println(t + " throws exception: " + e);
            }
        });
        t.start();
    }
}
class SimpleThread implements Runnable {

    @Override
    public void run() {
        throw new RuntimeException("It's a great exception");
    }
}
