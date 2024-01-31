public class Producer extends Thread {
    ProducerConsumer p;

    public Producer(ProducerConsumer p) {
        this.p = p;
    }

    public void run() {
        int i = 1;
        while (true) {
            try {
                this.p.produce_item(i);
            } catch (InterruptedException e) {
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
            i += 1;

        }
    }
}
