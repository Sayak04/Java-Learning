import java.util.Calendar;
import java.util.Scanner;

import tools.Calculator;
import tools.AdvancedCalculator;

public class Objects {

    private static String getDayOfWeekString(int dayOfWeek) {
        String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return daysOfWeek[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // System.out.println(calculator.add(1, 5));
        // System.out.println(calculator.add(1, 5, 7));
        // calculator.display(10, 12);

        // jagged array
        // int nums[][] = new int[3][];
        // nums[0] = new int[2];
        // nums[1] = new int[3];
        // nums[2] = new int[6];

        // String name = new String("Sayak");
        // System.out.println(name);
        // System.out.println(name.hashCode());

        Human human1 = new Human(65, "Sayak");

        new Human(); // anonymous object -> we cant reuse it again, only once.

        System.out.println(human1.getAge() + " " + human1.getName());
        

        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, 11, 3);
        
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        String day = getDayOfWeekString(dayOfWeek);


    }
}
