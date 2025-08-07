package aug6;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;

    public Employee(String firstName, String lastName, int age) throws InvalidNameException {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new InvalidNameException("First name cannot be blank");
        }
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new InvalidNameException("Last name cannot be blank");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void displayDetails() {
        System.out.println("Full Name: " + getFullName());
        System.out.println("Age: " + age);
    }
}


