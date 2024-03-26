import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        // Exercise 1
        String a = "hello";
        System.out.println(reverse(a));

        // Exercise 2
        // Convert cm to km
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter measurement (cm): ");
        int measurement = Integer.parseInt(userInput.nextLine());
        System.out.println("It is " + convert(measurement) + " km");
        userInput.close();




    }

    private static String reverse(String a) {
        String[] chars = a.split("");
        StringBuilder reversed = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }
        return reversed.toString();
    }

    private static float convert(int a) {
        if (a > 0) {
            return (float) a / 100000;
        } else {
            return -1;
        }
    }
}
