package callables;

import java.util.concurrent.*;

public class main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // in main thread

        Callable<String> task = () -> "Call 1";

        Future<String> future = executorService.submit(task);

        try {
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

    }
}
