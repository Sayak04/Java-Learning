import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class SupplyAsnc {

    public static void delay(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Supplier<String> supplier = () -> {
            delay(1);
            System.out.println("i'm in supplier" + Thread.currentThread().getName());
            return "hello from supplier";
        };

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(supplier);
        System.out.println("Im in main");

        String value = completableFuture.join();
        System.out.println("value:- " + value);

    }

}
