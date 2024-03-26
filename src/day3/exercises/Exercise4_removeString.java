import java.util.Scanner;

public class Exercise4_removeString {
    public static void main(String[] args) {
        // Exercise 4
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter string:");
        String oriString = userInput.nextLine();
        System.out.println("Target to remove: ");
        String targetString = userInput.nextLine();
        userInput.close();

        // Find the index of the target string
        int index = oriString.indexOf(targetString);

        if (index == -1) {
            System.out.println("None found");
        } else {
            String newString = oriString.substring(0, index) + oriString.substring(index + targetString.length());
            System.out.println("New String: " + newString);
        }
    }
}
