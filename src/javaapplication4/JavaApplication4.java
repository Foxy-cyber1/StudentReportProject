
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student ID: ");
        int id = input.nextInt();

        System.out.print("Enter student grade: ");
        double grade = input.nextDouble();

        Student student = new Student(name, id, grade);

        StudentReport report = new StudentReport();
        report.printReport(student);

        input.close();
    }
}
