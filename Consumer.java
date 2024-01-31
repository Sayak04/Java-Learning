public class Consumer extends Thread {

    ProducerConsumer p;

    public Consumer(ProducerConsumer p) {
        this.p = p;
    }

    public void run() {
        while (true) {
            try {
                this.p.consume_item();
            } catch (InterruptedException e) {
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }
}
