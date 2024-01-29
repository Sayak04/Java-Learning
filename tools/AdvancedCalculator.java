package tools;
public class AdvancedCalculator extends Calculator {

    @Override
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }

    public int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public int divison(int n1, int n2) {
        return n1 / n2;
    }
}
