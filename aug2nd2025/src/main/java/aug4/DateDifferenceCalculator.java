package aug4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDifferenceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            
            System.out.print("Enter the first date (dd-MM-yyyy): ");
            String date1Str = sc.nextLine();
            LocalDate date1 = LocalDate.parse(date1Str, formatter);

           
            System.out.print("Enter the second date (dd-MM-yyyy): ");
            String date2Str = sc.nextLine();
            LocalDate date2 = LocalDate.parse(date2Str, formatter);

          
            if (date1.isAfter(date2)) {
                LocalDate temp = date1;
                date1 = date2;
                date2 = temp;
            }
            Period duration = Period.between(date1, date2);
            System.out.println("\nDuration between " + date1 + " and " + date2 + ":");
            System.out.println("Years : " + duration.getYears());
            System.out.println("Months: " + duration.getMonths());
            System.out.println("Days  : " + duration.getDays());

        } catch (Exception e) {
            System.out.println("Invalid input. Please use the format dd-MM-yyyy.");
        }

        sc.close();
    }
}

