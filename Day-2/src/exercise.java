import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class exercise {

    public static void main(String[] args) {
        // Exercise 1
        System.out.println("Exercise 1");
        int length = 5;
        int width = 3;
        System.out.println("Area of rectangle: " + calculateArea(length, width) + "\n");

        // Exercise 2
        System.out.println("Exercise 2");
        int radius = 5;
        System.out.println("Diameter: " + calculateDiameter(radius));
        System.out.println("Circumference: " + calculateCircumference(radius));
        System.out.println("Circle Area: " + calculateCircleArea(radius) + "\n");

        // Exercise 3
        System.out.println("Exercise 3");
        int a = 80;
        int b = 65;
        System.out.println("Third angle: " + calculateAngle(a, b) + "\n");

        // Exercise 4
        System.out.println("Exercise 4");
        LocalDate date1 = LocalDate.of(2024, 3, 19);
        LocalDate date2 = LocalDate.of(2024, 3, 21);
        System.out.println("Days difference: " + dateDiff(date1, date2) + "\n");

        // Exercise 5
        System.out.println("Exercise 5");
        String name = "John Doe";
        System.out.println("Initials: " + nameInitials(name));

    }

    private static int calculateArea(int a, int b) {
        return a * b;
    }

    private static int calculateDiameter(int a) {
        return a * 2;
    }

    private static double calculateCircumference(int a) {
        return 2 * Math.PI * a;
    }

    private static double calculateCircleArea(int a) {
        return Math.PI * Math.pow(a, 2);
    }

    private static int calculateAngle(int a, int b) {
        return 180 - (a + b);
    }

    private static long dateDiff(LocalDate a, LocalDate b) {
        Duration diff = Duration.between(a.atStartOfDay(), b.atStartOfDay());
        return diff.toDays();
    }

    private static String nameInitials(String a) {
        StringBuilder initials = new StringBuilder();

        char[] characters = a.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (i == 0 || characters[i - 1] == ' ') {
                initials.append(characters[i]);
            }
        }
        return initials.toString().toUpperCase();
    }

}