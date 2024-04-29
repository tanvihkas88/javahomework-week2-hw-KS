package homework2;

import java.util.Scanner;

public class Programme4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Is leap year: " + isLeapYear(year));

        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        System.out.println("Enter year: ");
        int yearForMonth = scanner.nextInt();
        System.out.println("Days in month: " + getDaysInMonth(month, yearForMonth));

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999)
            return false;

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }
}
