package multithreading;

class Task1 extends Thread {
    public void run() {
        System.out.println("\nTask 1 starts\n");
        for(int i=101; i<=199; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 1 done\n");
    }
}

class Task2 implements Runnable{
    public void run() {
        System.out.println("\nTask 2 starts\n");
        for(int i=201; i<=299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 2 done\n");
    }
}

public class ThreadRunner {
    public static void main(String[] args) throws InterruptedException {

        // Task 1

        System.out.println("\nTask 1 kicked off\n");
        
        Task1 task1 = new Task1();
        task1.start();
        
        // Task 2

        System.out.println("\nTask 2 kicked off\n");

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();

        task1.join();
        task2Thread.join();

        // Task 3

        System.out.println("\nTask 3 kicked off\n");

        System.out.println("\nTask 3 starts\n");

        for(int i=301; i<=399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 3 done\n");
    }
}
