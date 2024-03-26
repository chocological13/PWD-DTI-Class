public class WhileLoop {

    public static void main(String[] args) {

        // While
        // Won't execute if condition not met
//        while (boolean statement) {
//            // code
//        }

        // Do - While Loop
        // Will execute at least once

        int i = 6;
        do {
            System.out.println("Iteration No: " + i);
            i++;
        } while (i < 5);
        // While condition is not met, but the loop is still executed at least once.

        System.out.println(" ");

        int j = 0;
        while (j < 5) {
            System.out.println("While iteration no: " + j);
            j++;
        }
    }
}
