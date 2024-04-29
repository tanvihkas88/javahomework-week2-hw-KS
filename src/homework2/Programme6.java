package homework2;

import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is odd or even
        String result = (number % 2 == 0) ? "even" : "odd";

        // Print the result
        System.out.println("The input number is " + result + ".");

        scanner.close();
    }
}


