package Day3_Student_Grade_Management_System;

public class GradeCalculator {

    public int calculateTotal(Student student){
        int total=0;
        for(int marks : student.getMarks()){
            total=total+marks;
        }
        return total;
    }

    public double calculateAverage(Student student){
        return(double) calculateTotal(student)/student.getMarks().length;
    }

    public char calculateGrade(Student student){
        double average = calculateAverage(student);

        if(average>=90) return 'A';
        else if (average>=75) return 'B';
        else if (average>=60) return 'C';
        else if (average>=40) return 'D';
        else return 'F';

    }
}
