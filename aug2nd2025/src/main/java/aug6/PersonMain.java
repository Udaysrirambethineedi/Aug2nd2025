package aug6;

import java.util.Scanner;
import com.example.exception.InvalidAgeException;

public class PersonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            if (age <= 15) {
                throw new InvalidAgeException("Age must be above 15 to be valid.");
            }

            Person person = new Person(firstName, lastName, age);
            person.displayDetails();

        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        } finally {
            sc.close();
        }
    }
}

