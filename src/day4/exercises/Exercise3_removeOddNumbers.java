package exercises;

import java.util.Scanner;

public class Exercise3_removeOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for input
        // Array size
        System.out.print("Please enter array size: ");
        int arraySize = scan.nextInt();
        // Check if input is valid
        while (arraySize <= 0 ) {
            System.out.print("Please only enter positive numbers: ");
            arraySize = scan.nextInt();
        }

        // Initialize array
        int[] numbers = new int[arraySize];

        // Array element
        System.out.println("Please enter array elements (int): ");
        for(int i = 0; i < arraySize; i++) {
            numbers[i] = scan.nextInt();
        }
        scan.nextLine();
        scan.close();

        // Print out array to see what user has input
        System.out.print("Your current array is: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");

        removeOddNumbers(numbers);
    }

    public static void removeOddNumbers(int[] numbers) {
        System.out.print("New array without odd numbers: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                continue;
            } else {
                System.out.print(number + " ");
            }
        }
    }
}
