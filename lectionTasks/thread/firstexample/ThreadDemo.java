package kz.epam.chess.lesson.thread.firstexample;

public class ThreadDemo {
    public static void main(String[] args) {
        Talk talk = new Talk();
        Thread walk = new Thread(new Walk());

        talk.start();
        walk.start();
    }
}
