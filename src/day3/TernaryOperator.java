public class TernaryOperator {
    public static void main(String[] args) {
        char target = '#';
        int encodedValue = (target == '#') ? 0 : (target == 'X') ? 1 : (target == 'Z') ? 2 : 3;
        System.out.println(encodedValue);

        int number = -1;
        boolean isEven = (number % 2 == 0) ? true : false;
        System.out.println(isEven);
    }
}
