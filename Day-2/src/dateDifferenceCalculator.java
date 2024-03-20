import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class dateDifferenceCalculator {
    public static void main(String[] args) {
        // YYYY-MM-DD -> 2024-01-11
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start Date: ");
        String startDate = scanner.nextLine();
        System.out.println("End Date: ");
        String endDate = scanner.nextLine();
        // Don't forget to close scanner to reserve memory
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedStartDate = LocalDate.parse(startDate, formatter);
        LocalDate parsedEndDate = LocalDate.parse(endDate, formatter);

        long daysDifference = ChronoUnit.DAYS.between(parsedStartDate, parsedEndDate);
        System.out.println("Days difference between start and end is: " + daysDifference + " Days.");
    }    
}
