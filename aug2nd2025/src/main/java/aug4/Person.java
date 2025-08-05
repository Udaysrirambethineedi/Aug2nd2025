package aug4;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.dateOfBirth = LocalDate.now();
    }
    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        if (dateOfBirth != null) {
            return Period.between(dateOfBirth, currentDate).getYears();
        } else {
            return 0;
        }
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void displayPersonDetails() {
        System.out.println("Person Details:");
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Age: " + calculateAge());
    }
}

