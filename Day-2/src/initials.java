import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();
        scanner.close();

        StringBuilder initials = new StringBuilder();
        char[] characters = fullName.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (i == 0 || characters[i - 1] == ' ') {
                initials.append(characters[i]);
            }
        }
        System.out.println("Your initials are: " + initials);
    }
}
