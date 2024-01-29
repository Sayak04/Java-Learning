class SayakException extends Exception {
    public SayakException(String s) {
        super(s);
    }
}

public class Exceptions {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        int nums[] = new int[5];

        try {
            j = 18 / i;
            if (j == 0)
                throw new SayakException("My Exception, I dont want to print zero");
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (SayakException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bounds");
        }

        System.out.println(j);
    }

}
