import java.util.Scanner;

public class Exercise6_swapCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = scan.nextLine();

        System.out.println("The case swapped word is: " + swapCase(word));
    }

    public static String swapCase(String a) {
        String[] chars = a.split("");
        StringBuilder newWord = new StringBuilder();

        for (String c : chars) {
            if (Character.isUpperCase(c.charAt(0))) {
                newWord.append(c.toLowerCase());
            } else {
                newWord.append(c.toUpperCase());
            }
        }

        return newWord.toString();
    }
}
