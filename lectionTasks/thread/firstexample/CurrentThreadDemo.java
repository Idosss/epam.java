package kz.epam.chess.lesson.thread.firstexample;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток: " + t);
        t.setName("My thread");
        System.out.println("После изменения имени " + t);
        try {
            for (int n = 5; n > 0; n--){
                System.out.println(n);
                Thread.sleep(400);
            }
        }catch(InterruptedException e){
            System.out.println("Главный поток завершен");
        }
    }
}
