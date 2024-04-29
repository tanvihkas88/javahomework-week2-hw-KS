package homework2;

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alphabet
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().charAt(0);

        // Print corresponding city name or "Invalid Entry"
        switch (alphabet) {
            case 'A':
                System.out.println("City name: Ahmedabad");
                break;
            case 'B':
                System.out.println("City name: Baroda");
                break;
            case 'C':
                System.out.println("City name: Chennai");
                break;
            case 'D':
                System.out.println("City name: Delhi");
                break;
            case 'E':
                System.out.println("City name: Mumbai");
                break;
            case 'F':
                System.out.println("City name: Kolkata");
                break;
            default:
                System.out.println("Invalid Entry");
        }

        scanner.close();
    }

}
