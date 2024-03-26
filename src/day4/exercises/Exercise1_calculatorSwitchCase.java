package exercises;

import java.util.Scanner;

public class Exercise1_calculatorSwitchCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for numbers to calculate
        System.out.println("Enter num: ");
        int num1 = scan.nextInt();
        System.out.println("Enter num: ");
        int num2 = scan.nextInt();
        scan.nextLine();

        // Prompt user for method of calculation
        System.out.println("Enter operand ('+' / '-' / '/' / '*'): ");
        char oper = scan.nextLine().charAt(0);

        // Error catching
        while (oper != '+' && oper != '-' && oper != '/' && oper != '*') {
            System.out.println("Please only enter ('+' / '-' / '/' / '*'): ");
            oper = scan.nextLine().charAt(0);
        }
        scan.close();

        calculate(num1, num2, oper);
    }

    public static void calculate(int a, int b, char oper) {
        switch(oper) {
            case '+': {
                System.out.println("Result is: " + (a + b));
                break;
            }
            case '-': {
                System.out.println("Result is: " + (a - b));
                break;
            }
            case '/': {
                System.out.println("Result is: " + (a / b));
                break;
            }
            default: {
                System.out.println("Result is: " + (a * b));
            }
        }
    }
}
