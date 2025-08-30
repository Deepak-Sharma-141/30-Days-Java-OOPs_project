package Day7_School_Management_System;

import java.util.ArrayList;
import java.util.List;

class Student extends Person implements Payable {
    private int grade;
    private List<Course> courses = new ArrayList<>();

    public Student(int id, String name, int grade) {
        super(id, name);
        this.grade = grade;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + getName() + " (Grade " + grade + ")");
    }

    public double calculatePayment() {
        return courses.size() * 5000; // Example: ₹5000 per course
    }
}