package executors;

import java.util.concurrent.*;

public class PlayingWithExecutorsAndRunnables {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<String> task = () -> {
            Thread.sleep(300);
            return "I am in thread " + Thread.currentThread().getName();
        };

        //ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; i++) {

            //new Thread(task).start();
            Future<String> future = service.submit(task);
            try {
                System.out.println("I get: " + future.get(100, TimeUnit.MILLISECONDS));
            } catch (TimeoutException e) {
                e.printStackTrace();
            }

        }

        service.shutdown();
    }
}
