package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5_findIndices_listPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for array size
        System.out.print("Enter array size: ");
        int arraySize = scan.nextInt();
        while (arraySize <= 0) {
            System.out.print("Please only enter positive number!!");
            arraySize = scan.nextInt();
        }

        // Initialize array
        int[] numbers = new int[arraySize];

        // Prompt user for array elements
        System.out.println("Please enter array elements: ");
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scan.nextInt();
        }

        // Show the user their array
        System.out.print("Your current array is: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Ask the user for the target integer
        System.out.print("Enter the sum of integer you would like to find: ");
        int targetInt = scan.nextInt();
        scan.nextLine();
        scan.close();

        // Initialize Method
        List<List<Integer>> pairs = findPairs(numbers, targetInt);

        // Print out result
        if (pairs != null) {
            int pairIndex = 1;
            for (List<Integer> pair : pairs) {
                // Convert pairs list into arrays
                Integer[] pairArray = pair.toArray(new Integer[2]);

                System.out.println("The indices of the two numbers that add up to the target is: " + pairArray[0] + " and " + pairArray[1]);
                pairIndex++;
            }
        } else {
            System.out.println("No matches were found :(");
        }
    }

    public static List<List<Integer>> findPairs(int[] numbers, int targetInt) {
        // Initiate boolean to check validity of match
        boolean foundMatch = false;
        List<List<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == targetInt) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(i);
                    pair.add(j);
                    pairs.add(pair);
                    foundMatch = true;
                }
            }
        }
        if (!foundMatch) {
            return null;
        } else {
            return pairs;
        }
    }
}
