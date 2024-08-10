public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Gaurav Yadav", 21, "Male");
        Human h2 = new Human("Gaurav Yadav", 21, "Male");
        Human h3 = new Human();
        h1.introduce();
        Human.getPopulation();
    }
}