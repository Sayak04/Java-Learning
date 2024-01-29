class A {
    public void show() {
        System.out.println("In A Show");
    }
    
}

class B extends A {
    public void show() {
        System.out.println("In B Show");
    }
}

class C extends A {

}

public class Polymorphism {
    public static void main(String[] args) {

        // reference of a superclass
        // and object of a subclass
        A obj = new A();
        obj.show();

        // runtime polymorphism
        // dynamic methdod dispatch
        obj = new B();
        obj.show();
    }    
}
