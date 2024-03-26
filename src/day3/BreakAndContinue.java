public class BreakAndContinue {
    public static void main(String[] args) {

        // Continue
        int num = 10;
        for (int i = 0; i < num; i++) {
            if (i % 2 != 0) continue;
            // Only affect odd numbers, they will not be printed
            System.out.println(i);
        }

        System.out.println(" ");

        // Break
        for (int i = 0; i < num; i++) {
            if (i == 5) break;
            // Program will quit when i is 5
            System.out.println(i);
        }

        System.out.println(" ");

        String[] names = {"A", "B", "C", "D"};
        String searchTarget = "B";

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchTarget)) {
                System.out.println(searchTarget + " was found at index " + i);
                break;
                // Program will stop after target id found
            } else {
                System.out.println(names[i] + " is not " + searchTarget);
            }
        }
    }
}
