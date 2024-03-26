import java.util.Scanner;

public class Exercise5_checkPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scan.nextLine();
        scan.close();

        if (isPalindrome(word)) {
            System.out.println("It's a palindrome!!");
        } else {
            System.out.println("It's not a palindrome :(");
        }
    }

    public static boolean isPalindrome(String a) {
        int i = 0;
        int j = a.length() - 1;

        while (i < j){
            if (a.charAt(i) != a.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
