package Unit_3_JavaFeatures;

record  Stud (int id, String name, int marks){};

public class Records {
    public static void main(String[] args) {
        Stud s = new Stud(1, "gaurav", 99);
        System.out.println(s.id());
        System.out.println(s.marks());
        System.out.println(s);
    }
}
