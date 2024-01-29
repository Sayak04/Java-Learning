abstract class Car {
    public abstract void drive();
    public void playMusic() {
        System.out.println("playMusic");
    }
}

class Alto extends Car {
    public void drive() {
        System.out.println("Driving...");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        
        // we cannot create an object of an abstract class
        // Car car = new Car();

        Car obj = new Alto();
        obj.drive();
        obj.playMusic();
    }    
}
