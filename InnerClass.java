class A {
    public void show() {
        System.out.println("in A");
    }
}

public class InnerClass {
    public static void main(String[] args) {

        // anonymous inner class
        A obj = new A() {
            public void show() {
                System.out.println("In Inner class show");
            }
        };
        obj.show();
    }
}
