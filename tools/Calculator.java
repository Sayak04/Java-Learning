package tools;

public class Calculator {
    int noOfKeys;
    static String type; // common to all objects of Calculator type

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method overloading
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public void display(int n1, int n2) {
        System.out.println(n1 + " " + n2);
    }
}