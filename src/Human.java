// A file can contain only one public class
public class Human {
    static int population = 0;   // Static or class variable
    String name;                 // instance variable
    int age;
    String gender;

    Human(){}
    Human(String name, int age, String gender){    // constructor overloading
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static { // it is a static block, runs when the class is loaded to the memory
        System.out.println("Human Class loaded to the memory");
    }

    {   // instance block,  This block will run before the constructor when ever the new object is created.
        name = "N/A";   // when ever the new object will be created
        age = -1;       //  this block will automatically set the default values to the instance variables
        gender = "N/A";
        population++;
    }

    void introduce(){   // class methods, they belong to the object
        System.out.println("I am " + name + " " + age + " year old "+ gender+".");
    }

    static void getPopulation(){    // static method, it belongs to the class, not to the objects of the class
        System.out.println("Total human population : "+population);
    }

    public static void main(String[] args) {
        Human h1 = new Human("Gaurav Yadav", 21, "Male");
        Human h2 = new Human("Gaurav Yadav", 21, "Male");
        Human h3 = new Human();
        h1.introduce();          // object methods accessed with objects
        Human.getPopulation();  // static methods accessed with class
    }
}
