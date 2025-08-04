package aug2nd2025;

import java.util.Scanner;

public class positivestring {

    public static boolean isPositiveString(String str) {
        str = str.toUpperCase(); 

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string: ");
        String input = sc.nextLine();

        if (isPositiveString(input)) {
            System.out.println(input + " is a positive String.");
        } else {
            System.out.println(input + " is not a Positive String.");
        }

        sc.close();
    }
}

