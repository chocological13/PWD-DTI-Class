public class Parameters_passByValue {

    public static void main(String[] args) {
        // Pass by value
        // When you pass a primitive type to a method, Java passes the actual value of the variable.
        int number = 1;
        increment(number); // This will print out 2
        System.out.println((number)); // This will print out 1
    }

    public static void increment(int number) {
        number++;
        System.out.println(number);
    }
}
