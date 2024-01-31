// A future class represents a future result of an asynchronous operation
//  - a result that will appear in the Future after the processing is complete

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        // Executor Service is the improved version of Threads
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Runnable is the core interface for representing multithreaded tasks
        // Callable is the improved version

        // Callable contains a single call method and returns a generic value of V
        Callable<String> callable = () -> {
            delay(1);
            return "hello from future";
        };

        Future<String> future = executorService.submit(callable);

        // do something else
        System.out.println("Doing something else");

        String message = future.get(); // blocks further operation until it is completed
        System.out.println(message);
        executorService.shutdown();
    }

    private static void delay(int i) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }    


    // Drawbacks of future
    // 1) No manual completion
    // 2) Can not be chained with other operations
    // 3) Can not be combined with other operations
    // 4) No exception handling


    // To address these drawbacks we use **CompletableFuture**
}
