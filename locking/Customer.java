package multithreading.locking;

public class Customer {
    public static void main(String[] args) {
        BankAccount bn = new BankAccount();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                bn.withdraw(500);
            }
        };

        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");

        t1.start();
        t2.start();

    }
}
