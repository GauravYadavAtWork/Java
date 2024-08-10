public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Gaurav Yadav", 21, "Male");
        Human h2 = new Human("Gaurav Yadav", 21, "Male");
        Human h3 = new Human();
        h1.introduce();          // object methods accessed with objects
        Human.getPopulation();  // static methods accessed with class
    }
}