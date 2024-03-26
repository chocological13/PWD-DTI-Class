package exercises;

import java.util.Scanner;

public class Exercise4_fizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user to input counter
        System.out.print("Please enter count: ");
        int count = scan.nextInt();
        while (count <= 0) {
            System.out.print("Please only enter positive number: ");
            count = scan.nextInt();
        }
        scan.close();

        // Initiate FizzBuzz
        fizzBuzz(count);
    }

    public static void fizzBuzz(int count) {
        for (int i = 1; i <= count; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) { // We put this first to make sure it only runs once when this condition is met
                System.out.print("FizzBuzz" + " ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz" + " ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz" + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
