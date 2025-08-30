package Day7_School_Management_System;

import java.util.ArrayList;
import java.util.List;

class Course {
    private int courseId;
    private String title;
    private Teacher teacher;
    private List<Student> enrolledStudents = new ArrayList<>();

    public Course(int courseId, String title) {
        this.courseId = courseId;
        this.title = title;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
        teacher.assignCourse(this);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.enrollCourse(this);
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + title);
        if (teacher != null)
            System.out.println(" Teacher: " + teacher.getName());
        System.out.println(" Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("  - " + s.getName());
        }
    }
}
