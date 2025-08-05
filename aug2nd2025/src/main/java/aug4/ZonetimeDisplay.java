package aug4;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ZonetimeDisplay {

    public static void printDateTimeForZone(String zoneIdStr) {
        try {
            ZoneId zone = ZoneId.of(zoneIdStr);
            ZonedDateTime dateTime = ZonedDateTime.now(zone);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
            System.out.println("Current date and time in " + zoneIdStr + ": " + dateTime.format(formatter));

        } catch (Exception e) {
            System.out.println("Invalid Zone ID. Please enter a valid one like 'india/Tokyo' or 'Europe/London'.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Zone ID (e.g., America/New_York, Asia/Tokyo, Europe/London): ");
        String zoneInput = sc.nextLine();

        printDateTimeForZone(zoneInput);

        sc.close();
    }
}

