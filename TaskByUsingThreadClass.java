package multithreading;


class A extends Thread
{
    @Override
    public void run() {
        for(int i=0; i<5; i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class TaskByUsingThreadClass {
    public static void main(String[] args) throws InterruptedException {
        A t = new A();
        t.start();
        for(int i=0; i<5; i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
