package Day3_Student_Grade_Management_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter RollNo: ");
        int rollNo = scanner.nextInt();

        System.out.println("Enter number of Subjects: ");
        int subjects = scanner.nextInt();

        int[] marks =new int[subjects];
        for(int i=0;i<subjects;i++){
            System.out.println("Enter the marks for Subject "+(i+1)+" : ");
            marks[i] = scanner.nextInt();
        }

        Student student=new Student(name,rollNo,marks);

        GradeCalculator calculator = new GradeCalculator();

        int total = calculator.calculateTotal(student);
        double average = calculator.calculateAverage(student);
        char grade = calculator.calculateGrade(student);

        System.out.println("\n------STUDENT REPORT------");
        System.out.println("Name: "+student.getName());
        System.out.println("RollNo: "+student.getRollNo());
        System.out.println("Total marks: "+total);
        System.out.println("Average: "+average);
        System.out.println("Grade: "+grade);

        scanner.close();

    }
}
