package javaapplication4;


public class StudentReport {

    public void printReport(Student student) {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Grade: " + student.getGrade());

        if (student.getGrade() >= 50) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
    }
}
