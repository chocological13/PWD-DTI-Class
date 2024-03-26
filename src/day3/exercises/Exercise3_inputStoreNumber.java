import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise3_inputStoreNumber {
    public static void main(String[] args) {
        // Prompt user for number
        Scanner userInput = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        String confirm;

        do {
            System.out.println("Enter number: ");
            numbers.add(userInput.nextDouble());
            userInput.nextLine(); // to consume the newline character that is left in the input stream after reading the number using userInput.nextDouble()


            System.out.println("Would you like to continue? (y/n)");
            confirm = userInput.nextLine();
            while (!(confirm.equalsIgnoreCase("y")) && !(confirm.equalsIgnoreCase("n"))) {
                System.out.println("Please only enter y/n");
                confirm = userInput.nextLine();
            }
        } while (confirm.equalsIgnoreCase("y"));

        if (confirm.equalsIgnoreCase("n")) {
            System.out.println("Numbers entered: ");
            for (double number : numbers) {
                System.out.println((int) number);
            }
        }
        userInput.close();
    }
}
