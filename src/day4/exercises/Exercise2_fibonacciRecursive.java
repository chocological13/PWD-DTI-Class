package exercises;

import java.util.Scanner;

public class Exercise2_fibonacciRecursive {

    // Initialize first numbers
    static int n1 = 0, n2 = 1, n3 = 0;
    static void fibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            System.out.print(" " + n3);

            // Assign new numbers for next calculation
            n1 = n2;
            n2 = n3;

            // Recursive method
            fibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for digit count
        System.out.print("Please enter count: ");
        int count = scan.nextInt();
        scan.nextLine();
        scan.close();

        // Print out the first numbers
        System.out.print(n1 + " " + n2);

        // Start calculation at 2 because we already did 2
        fibonacci(count - 2);
    }
}
