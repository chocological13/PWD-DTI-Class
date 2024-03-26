import java.util.Scanner;

public class copyEx4 {
    public static void main(String[] args) {
         // Initialize scanner
        Scanner scan = new Scanner(System.in);

        // Ask user for input for the original string
        System.out.println("Enter your word:");
        String iniString = scan.nextLine();

        // Ask user for input for the target
        System.out.println("Enter your target search: ");
        String targetString = scan.nextLine();

        // Function
        System.out.println("The new word is: " + removeString(iniString, targetString));

    }

    private static String removeString(String a, String b) {
        // Determine the index of which the target string is inside the original string
        int index = a.indexOf(b);

        // See if string exists inside the
        if (index == -1) {
            return "No string found";
        } else {
            String newString = a.substring(0, index) + a.substring(index + b.length());
            return newString;
        }
    }
}
