package Day7_School_Management_System;

import java.util.ArrayList;
import java.util.List;

class Teacher extends Person implements Payable {
    private String subject;
    private List<Course> assignedCourses = new ArrayList<>();

    public Teacher(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    public void assignCourse(Course course) {
        assignedCourses.add(course);
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher: " + getName() + " (Subject: " + subject + ")");
    }

    @Override
    public double calculatePayment() {
        return assignedCourses.size() * 20000; // Example: ₹20000 per course
    }
}