public class ProducerConsumer {
    int n;
    boolean f = false;

    // false -> producer will produce
    // true -> consumer will consume

    synchronized public void produce_item(int n) throws InterruptedException {
        if (f) {
            // producer will wait
            wait();
        }
        this.n = n;
        System.out.println("Produced:- " + this.n);
        f = true;
        notify();
    }

    synchronized public int consume_item() throws InterruptedException {
        if (!f) {
            // consumer will wait
            wait();
        }
        System.out.println("Consumed:- " + this.n);
        f = false;
        notify();
        return this.n;
    }
}
