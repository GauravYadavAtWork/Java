public class Main {
    public static void main(String[] args) {
        Student S1 = new Student("Gaurav Yadav", 21, "Male", "PSIT, Kanput", 72);
        Human h2 = new Human("Gaurav Yadav", 21, "Male");
        Human h3 = new Human();
        S1.introduce();
        Human.getPopulation();
    }
}