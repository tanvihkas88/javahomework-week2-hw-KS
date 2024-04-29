package homework2;

import java.util.Scanner;

public class Programme12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        if (Character.isLetter(input)) {
            System.out.println("Input is an alphabet.");
        } else if (Character.isDigit(input)) {
            System.out.println("Input is a number.");
        } else {
            System.out.println("Input is a symbol.");
        }

        scanner.close();
    }
}

