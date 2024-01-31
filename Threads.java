// We can also use using Runnable
class C implements Runnable {
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hi");
            try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
}

class A extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hi");
            try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("hello");
            try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
}

public class Threads {
    public static void main(String[] args) {

        // If we use Runnable interface
        // Thread thread = new Thread(Reference of our thread class)
        
        A obj1 = new A();
        B obj2 = new B();

        // range is from 1 to 10
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        // start a new thread
        obj1.start();
        obj2.start();

        System.out.println(obj1.getName());
        System.out.println(obj1.getId());

        obj2.setPriority(Thread.MAX_PRIORITY);
    	System.out.println(obj1.getPriority());
    	
    	obj1.start();
    	try {
			Thread.sleep(2);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
    	obj2.start();
    }
}
