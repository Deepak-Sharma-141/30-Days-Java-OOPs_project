package Day7_School_Management_System;

public class Main {
        public static void main(String[] args) {
            School school = new School();

            // Add Students
            Student s1 = new Student(1, "Deepak", 10);
            Student s2 = new Student(2, "Aman", 9);

            school.addStudent(s1);
            school.addStudent(s2);

            // Add Teachers
            Teacher t1 = new Teacher(1, "Mr. Sharma", "Math");
            Teacher t2 = new Teacher(2, "Ms. Gupta", "Science");

            school.addTeacher(t1);
            school.addTeacher(t2);

            // Add Courses
            Course c1 = new Course(101, "Algebra");
            Course c2 = new Course(102, "Physics");

            school.addCourse(c1);
            school.addCourse(c2);

            // Assign Teachers
            c1.assignTeacher(t1);
            c2.assignTeacher(t2);

            // Enroll Students
            c1.enrollStudent(s1);
            c2.enrollStudent(s2);
            c2.enrollStudent(s1);

            // Display All
            System.out.println("---- Students ----");
            school.showStudents();
            System.out.println("\n---- Teachers ----");
            school.showTeachers();
            System.out.println("\n---- Courses ----");
            school.showCourses();
        }
    }

