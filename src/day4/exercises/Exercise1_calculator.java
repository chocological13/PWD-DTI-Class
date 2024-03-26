package src.day4.exercises;

import java.util.Scanner;

public class Exercise1_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number: ");
        int num2 = scan.nextInt();
        scan.nextLine(); // To consume the next line in the input

        // Ask user for the operand
        System.out.print("Enter operand (+ / - / (/) / *): ");
        String oper = scan.nextLine();
        while (!(oper.equalsIgnoreCase("+")) && !(oper.equalsIgnoreCase("-")) && !(oper.equalsIgnoreCase("/")) && !(oper.equalsIgnoreCase("*"))) {
            System.out.print("Please only enter (+ / - / (/) / *): ");
            oper = scan.nextLine();
        }
        scan.close();

        System.out.println("The result is: " + calculate(num1, num2, oper));
    }

    public static int calculate(int a, int b, String c) {
        if (c.equalsIgnoreCase("+")) {
            return a + b;
        } else if (c.equalsIgnoreCase("-")) {
            return a - b;
        } else if (c.equalsIgnoreCase("/")) {
            return a / b;
        } else {
            return a * b;
        }
    }
}
