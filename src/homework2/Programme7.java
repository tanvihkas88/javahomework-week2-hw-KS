package homework2;

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sales details
        System.out.println("Enter sales details:");
        System.out.print("Sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Seller's Name: ");
        String sellerName = scanner.nextLine();
        System.out.print("Sales Amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.print("Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate sales commission
        double commission = 0.0;
        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }

        // Print sales commission
        System.out.println("\n--------------------------------------");
        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("--------------------------------------");
        System.out.println("Sales Commission: " + commission);
        System.out.println("--------------------------------------");

        // Calculate total salary
        double totalSalary = basicSalary + commission;
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("--------------------------------------");

        scanner.close();
    }
}
