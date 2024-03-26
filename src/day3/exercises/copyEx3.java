import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class copyEx3 {

    public static void main(String[] args) {
        // Write a code that reads n number of input from scanner
        Scanner scan = new Scanner(System.in);

        // Initialize array/list
        List<Double> numbers = new ArrayList<>();

        // Initialize String for confirmation
        String confirm;


        // Start do-while loop
        do {
            System.out.println("Enter number:");
            numbers.add(scan.nextDouble());
            scan.nextLine(); // This is to consume the next line string

            // Ask the user if they want to continue
            System.out.println("Would you like to continue? (y/n)");
            confirm = scan.nextLine();

            // Make sure user only inputs y or n
            while (!(confirm.equalsIgnoreCase("y")) && !(confirm.equalsIgnoreCase("n"))) {
                System.out.println("Please only enter y/n");
                confirm = scan.nextLine();
            }
        } while (confirm.equalsIgnoreCase("y"));
        // This loop will run as long as the user input y

        if (confirm.equalsIgnoreCase(("n"))) {
            System.out.println("The numbers you have entered are: ");
            for (double number : numbers) {
                System.out.println((int) number);
            }
        }
        scan.close();
    }

}
