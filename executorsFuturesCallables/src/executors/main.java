package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {

        //basics

        Runnable task1 = () -> System.out.println("Task 1");
        Runnable task2 = () -> System.out.println("Task 2");

        //Thread thread = new Thread(task1);

        //thread.start();

        //expensive

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //one thread in it, useful for reactive programming

        executorService.execute(task1);
        executorService.execute(task2);

        //order is important




        executorService.shutdown();
    }
}
