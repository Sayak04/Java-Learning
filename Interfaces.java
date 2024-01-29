interface A {

    // all varibles inside interface are final and static
    int age = 9;

    // all methods in interface are public and abstract
    void show();

    void config();
}

class B implements A {

    public void config() {
        System.out.println("in config");
    }

    public void show() {
        System.out.println("in show");
    }

}

public class Interfaces {
    public static void main(String[] args) {

        A obj;
        obj = new B();

        obj.show();
        obj.config();
    }

}
