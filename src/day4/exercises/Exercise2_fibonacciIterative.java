package exercises;

import java.util.Scanner;

public class Exercise2_fibonacciIterative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for the amount of digit
        System.out.print("Please enter how many Fibonacci numbers you would like: ");
        int count = scan.nextInt();
        scan.nextLine();
        scan.close();

        // Begin calculation
        fibonacci(count);
    }

    public static void fibonacci(int count) {
        // Initialize n1 and n2 to start the calculation with
        int n1 = 0;
        int n2 = 1;
        int n3;

        // Print out the first digits
        System.out.print(n1 + " " + n2);

        // Use loop to calculate the fibonacci sequence
        // Initialize i at 2 because we already printed n1 and n2
        for (int i = 2; i < count; i++) {
            // Calculate n3
            n3 = n1 + n2;

            // Print out n3
            System.out.print(" " + n3);

            // Assign new numbers to n1 and n2 for the next iteration
            n1 = n2;
            n2 = n3;
        }
    }
}
