package aug6;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("\nPerson Details:");
        System.out.println("First Name: " + firstName + "  Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
}

