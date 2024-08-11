package package2;
// Inheritance,  here student class inherits the Human class
public class Student extends Human {
    static int totalStudents = 0;
    String college;
    int rollNo;

    {
        college = "PSIT, Kanpur";
        totalStudents ++;
    }

    public Student(String name, int age, String gender, String clg, int Roll){
        super(name, age, gender);  // super key word used to refer to the parent class
        this.college = clg;
        this.rollNo = Roll;
    }
    public Student(String name, int age, String gender, int Roll){
        super(name, age, gender);
        this.rollNo = Roll;
    }

    public void introduce(){   // method overriding
        System.out.println("I am " + name + " " + age + " year old "+ gender+" of "+college);
    }

    public static void totalStudents(){    // static method, it belongs to the class, not to the objects of the class
        System.out.println("Total Students : "+totalStudents);
    }

    public static void main(String[] args) {
        Human h2 = new Human("Sakshee", 18, "Female");
        Student S1 = new Student("Gaurav Yadav", 21, "Male", "PSIT", 72);
        Student S2 = new Student("Harshit Dubey", 21, "Male", 77);
        S1.introduce();
        S2.introduce();
        Human.getPopulation();
        Student.totalStudents();
    }
}
