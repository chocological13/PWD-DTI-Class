public class SwitchCase {

    enum Day {
        MON, TUE, WED, THUR, FRI, SAT, SUN
    }

    public static void main(String[] args) {
        int number = 10;

        switch (number) {
            case 1:
                System.out.println("Number is 1\n");
            case 2:
                System.out.println("Number is 2\n");
            case 3:
                System.out.println("Number is 3\n");
            default:
                if (number % 2 == 0) {
                    System.out.println("Many but even\n");
                } else {
                    System.out.println("Many but odd\n");
                }
        }

        String result = switch (number) {
            case 1 -> "One\n";
            default -> {
                if (number % 2 == 0) yield "Even number";
                else yield "Odd number"; // yield can only be used if it's a switch case using arrow
            }
        };

        Day today = Day.MON;
        var isWeekday = switch (today) {
            case MON, TUE, WED, THUR, FRI -> "Yeah :(";
            case SAT, SUN -> "Nah we ball!";
        };
        System.out.println("Do we have work today? " + isWeekday);
    }
}
