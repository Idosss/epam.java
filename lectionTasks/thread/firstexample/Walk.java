package kz.epam.chess.lesson.thread.firstexample;

public class Walk implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<8; i++) {
            System.out.println("Walking");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e){
                System.err.print(e);
            }
        }
    }
}
