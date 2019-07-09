package kz.epam.lessons.thread.firstexample;

public class ThreadGroupListDemo {
    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("mainGroup");
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");
        MyThread ob1 = new MyThread("One", groupA);
        MyThread ob2 = new MyThread("Two", groupA);
        MyThread ob3 = new MyThread("Three", groupB);
        MyThread ob4 = new MyThread("Four", groupB);

        groupA.list();
        groupB.list();

        mainGroup.interrupt();
    }
}

