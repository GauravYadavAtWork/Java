package Unit_3_JavaFeatures;

//public class Annotations {
//
//    @Deprecated
//    public void oldMethod() {    // marker annotations
//        System.out.println("This method is deprecated");
//    }
//
//    @Override
//    public String toString() {
//        return "Annotations class";
//    }
//
//    public static void main(String[] args) {
//        Annotations obj = new Annotations();
//        obj.oldMethod(); // Calls the deprecated method
//        System.out.println(obj.toString()); // Calls the overridden method
//    }
//}




//repeating annotation
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Step 2: Define the container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Courses {
    Course[] value();
}

// Step 3: Define the repeatable annotation
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Courses.class) // Link the container annotation
@interface Course {
    String name();
}

@Course(name = "Mathematics")
@Course(name = "Physics")
@Course(name = "Computer Science")
class Student20 {
    String name;

    public Student20(String name) {
        this.name = name;
    }
}

public class Annotations {
    public static void main(String[] args) {
        // Create a student object
        Student20 student = new Student20("John Doe");

        // Retrieve the Course annotations
        Course[] courses = Student2.class.getAnnotationsByType(Course.class);

        System.out.println(student.name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println(course.name());
        }
    }
}
