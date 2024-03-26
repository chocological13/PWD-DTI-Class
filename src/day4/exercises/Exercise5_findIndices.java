package exercises;

import java.util.Scanner;

public class Exercise5_findIndices {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Prompt user for array of integers
    System.out.print("Enter array size: ");
    int arraySize = scan.nextInt();
    while (arraySize <= 0) {
      System.out.println("Please only enter positive integer: ");
      arraySize = scan.nextInt();
    }

    System.out.println("Please enter array element: ");
    int[] numbers = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      numbers[i] = scan.nextInt();
    }

    // Print out array to show the user what they have entered
    System.out.print("Your integers are: ");
    for (int number : numbers) {
      System.out.print(number + " ");
    }
    System.out.println(" ");

    // Ask the user for what the target integer
    System.out.print("Enter your target integer: ");
    int targetInt = scan.nextInt();
    scan.nextLine();
    scan.close();

    findIndices(numbers, targetInt);
  }

  public static void findIndices(int[] numbers, int targetInt) {
    // Initiate boolean to also check if match exists
    boolean foundMatch = false;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        int sum = numbers[i] + numbers[j];
        if (sum == targetInt) {
          System.out.println("The indices of the two numbers that add up to the target is: " + i + " and " + j);
          foundMatch = true;
        }
      }
    }
    if (!foundMatch) {
      System.out.println("No matching pairs were found :(");
    }
  }
}