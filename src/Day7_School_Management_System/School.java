package Day7_School_Management_System;

import java.util.ArrayList;
import java.util.List;

class School {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void addStudent(Student student) { students.add(student); }
    public void addTeacher(Teacher teacher) { teachers.add(teacher); }
    public void addCourse(Course course) { courses.add(course); }

    public void showStudents() {
        for (Student s : students) {
            s.displayInfo();
            System.out.println(" Fees: ₹" + s.calculatePayment());
        }
    }

    public void showTeachers() {
        for (Teacher t : teachers) {
            t.displayInfo();
            System.out.println(" Salary: ₹" + t.calculatePayment());
        }
    }

    public void showCourses() {
        for (Course c : courses) {
            c.displayCourseInfo();
            System.out.println("----");
        }
    }
}