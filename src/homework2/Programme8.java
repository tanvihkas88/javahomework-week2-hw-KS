package homework2;

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alphabet
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().charAt(0);

        // Print corresponding city name or "Invalid Entry"
        if (alphabet == 'A') {
            System.out.println("City name: Ahmedabad");
        } else if (alphabet == 'B') {
            System.out.println("City name: Bangalore");
        } else if (alphabet == 'C') {
            System.out.println("City name: Chennai");
        } else if (alphabet == 'D') {
            System.out.println("City name: Delhi");
        } else if (alphabet == 'E') {
            System.out.println("City name: Mumbai");
        } else if (alphabet == 'F') {
            System.out.println("City name: Kolkata");
        } else {
            System.out.println("Invalid Entry");
        }

        scanner.close();
    }

}
