import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class AnyAllOfExample {

    public static void delay(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static CompletableFuture<String> future1() {
        return CompletableFuture.supplyAsync(
            () -> {
                System.out.println("Future 1:- " + Thread.currentThread().getName());
                delay(2);
                return "1";
            }
        );
    }

    public static CompletableFuture<String> future2() {
        return CompletableFuture.supplyAsync(
            () -> {
                System.out.println("Future 2:- " + Thread.currentThread().getName());
                delay(4);
                return "2";
            }
        );
    }

    public static CompletableFuture<String> future3() {
        return CompletableFuture.supplyAsync(
            () -> {
                System.out.println("Future 3:- " + Thread.currentThread().getName());
                delay(1);
                return "3";
            }
        );
    }

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        // takes 4 seconds as f2 takes 4 seconds highest
        CompletableFuture<Void> future = CompletableFuture.allOf(future1(), future2(), future3());

        // takes 1 second as f3 finishes in 1 second
        // returns 3 as f3 return 3
        CompletableFuture<Object> futureAnyOf = CompletableFuture.anyOf(future1(), future2(), future3());

        System.out.println(future.join());
        System.out.println(futureAnyOf.join());

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken:- " + (endTime - startTime) / 1000);
    }
}
