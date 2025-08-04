package aug2nd2025;

public class Person {
    String firstName;
    String lastName;
    char gender;
    int age;
    double weight;
    //default constructor 

    public Person() {
        firstName = "none";
        lastName = "testing";
        gender = 'M';
        age = 0;
        weight = 00.0;
    }
    //parametreized

    public Person(String firstName, String lastName, char gender, int age, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public void displayDetails() {
        System.out.println("Person Details:\n");
        System.out.println("First Name: " + firstName + "  Last Name: " + lastName + "  Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}
