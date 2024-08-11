package package1;

import package2.Student;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Gaurav",21,"Male", 72);
        st1.introduce();
        Student.totalStudents();
    }
}
