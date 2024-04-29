package homework2;

import java.util.Scanner;

public class Programme5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter Employee ID: ");
        String employeeId = scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate salary components
        double[] salaryComponents = calculateSalary(basicSalary);
        double HRA = salaryComponents[0];
        double TA = salaryComponents[1];
        double DA = salaryComponents[2];
        double PF = salaryComponents[3];
        double grossSalary = salaryComponents[4];

        // Print salary slip
        printSalarySlip(employeeId, employeeName, basicSalary, HRA, TA, DA, PF, grossSalary);
    }

    public static double[] calculateSalary(double basicSalary) {
        double HRA = basicSalary * 0.10;
        double TA = basicSalary * 0.08;
        double DA = basicSalary * 0.09;
        double PF = basicSalary * 0.20;
        double grossSalary = basicSalary + HRA + TA + DA - PF;
        return new double[]{HRA, TA, DA, PF, grossSalary};
    }

    public static void printSalarySlip(String employeeId, String employeeName, double basicSalary,
                                       double HRA, double TA, double DA, double PF, double grossSalary) {
        System.out.println("______________________________");
        System.out.println("|        Salary Slip          |");
        System.out.println("|_____________________________|");
        System.out.printf("| Employee Id   : %-7s    |%n", employeeId);
        System.out.printf("| Employee Name : %-12s|%n", employeeName);
        System.out.println("|____________________________|");
        System.out.printf("| Basic Salary  : %-10.2f |%n", basicSalary);
        System.out.printf("| HRA 10%%       : %-10.2f |%n", HRA);
        System.out.printf("| TA 8%%         : %-10.2f |%n", TA);
        System.out.printf("| DA 9%%         : %-10.2f |%n", DA);
        System.out.printf("| PF - 20%%      : %-10.2f |%n", PF);
        System.out.println("|____________________________|");
        System.out.printf("| Gross Salary  : %-10.2f |%n", grossSalary);
        System.out.println("|============================|");
    }
}

