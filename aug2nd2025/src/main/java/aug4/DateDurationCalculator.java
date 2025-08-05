package aug4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDurationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Accept input date
        System.out.print("Enter a date (dd-MM-yyyy): ");
        String input = sc.nextLine();

        try {
           
            LocalDate inputDate = LocalDate.parse(input, formatter);
            LocalDate currentDate = LocalDate.now();

            Period period = Period.between(inputDate, currentDate);
            System.out.println("\nDuration from " + inputDate + " to " + currentDate + ":");
            System.out.println("Years : " + period.getYears());
            System.out.println("Months: " + period.getMonths());
            System.out.println("Days  : " + period.getDays());

        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter in dd-MM-yyyy format.");
        }

        sc.close();
    }
}

