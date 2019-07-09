package kz.epam.lessons.thread.firstexample;

public class ThreadDefaultUncaughtExceptionDemo {
    public static void main(String[] args) {

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t + " (default handler)throws exception: " + e);
            }
        });
        Thread t1 = new Thread(new MyThreads());
        Thread t2 = new Thread(new MyThreads());

        t2.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t + " throws exception: " + e);
            }
        });

        t1.start();
        t2.start();
    }
}

class MyThreads implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }
}