public class ThreadsChallenge {

    public static void main(String[] args) {
        
        ProducerConsumer pc = new ProducerConsumer();
        
        Producer pro = new Producer(pc);
        Consumer con = new Consumer(pc);
        
        pro.start();
        con.start();
    }
}
