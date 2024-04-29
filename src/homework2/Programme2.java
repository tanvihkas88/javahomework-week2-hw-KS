package homework2;

import java.util.Scanner;

public class Programme2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        // Leap year is divisible by 4 but not by 100 unless it is also divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        String result = isLeapYear ? "is a leap year" : "is not a leap year";

        System.out.println(year + " " + result + ".");

        scanner.close();
    }
}

