package homework2;

import java.util.Scanner;

public class Programme3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Math marks: ");
        int mathMarks = scanner.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        System.out.print("Enter Science marks: ");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        System.out.print("Enter English marks: ");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 3.0);

        System.out.println("\n_______________________________");
        System.out.println("|                             |");
        System.out.println("|         Mark Sheet          |");
        System.out.println("|_____________________________|");
        System.out.println("| Name : " + name + "               |      ");
        System.out.println("| Roll No : " + rollNo + "                 |       ");
        System.out.println("|_____________________________|");
        System.out.println("| Subjects : Marks            |");
        System.out.println("|_____________________________|");
        System.out.println("| Math : " + mathMarks + "                   |      ");
        System.out.println("| Science : " + scienceMarks + "                |      ");
        System.out.println("| English : " + englishMarks + "                |      ");
        System.out.println("|_____________________________|");
        System.out.println("| Total : " + totalMarks + "                 |       ");
        System.out.println("|_____________________________|");
        System.out.printf("| Percentage : %.1f%%          |%n", percentage);

        if (percentage >= 80) {
            System.out.println("| Result : Pass               |");
            System.out.println("| Grade : A+                  |");
        } else if (percentage >= 60) {
            System.out.println("| Result : Pass               |");
            System.out.println("| Grade : A                   |");
        } else if (percentage >= 50) {
            System.out.println("| Result : Pass               |");
            System.out.println("| Grade : B                   |");
        } else if (percentage >= 35) {
            System.out.println("| Result : Pass               |");
            System.out.println("| Grade : C                   |");
        } else {
            System.out.println("| Result : Fail               |");
            System.out.println("| Grade : -                   |");
        }
        System.out.println("|_____________________________|");

        scanner.close();
    }
}