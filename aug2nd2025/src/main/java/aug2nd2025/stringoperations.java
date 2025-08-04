package aug2nd2025;

import java.util.Scanner;

public class stringoperations {

    public static String performStringOperation(String input, int choice) {
        switch (choice) {
            case 1:
                return input + input;

            case 2:
                StringBuilder sb1 = new StringBuilder(input);
                for (int i = 1; i < sb1.length(); i += 2) {
                    sb1.setCharAt(i, '#');
                }
                return sb1.toString();

            case 3:
                StringBuilder sb2 = new StringBuilder();
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    if (sb2.indexOf(String.valueOf(ch)) == -1) {
                        sb2.append(ch);
                    }
                }
                return sb2.toString();

            case 4:
                StringBuilder sb3 = new StringBuilder(input);
                for (int i = 1; i < sb3.length(); i += 2) {
                    sb3.setCharAt(i, Character.toUpperCase(sb3.charAt(i)));
                }
                return sb3.toString();

            default:
                return "Invalid choice!";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("\nchoose an operation:");
        System.out.println("1. add the string to itself");
        System.out.println("2. replace odd positions with '#'");
        System.out.println("3. remove duplicate characters");
        System.out.println("4. change odd characters to uppercase");

        System.out.print("enter your choice (1-4): ");
        int choice = sc.nextInt();
        String result = performStringOperation(input, choice);
        System.out.println("result: " + result);
    }
}
