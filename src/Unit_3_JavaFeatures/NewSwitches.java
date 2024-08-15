package Unit_3_JavaFeatures;

// yeild is used to reture value from swtich

public class NewSwitches {
    public static void main(String[] args) {
        switch (6){
            case 1,2,5 -> System.out.println("hehe");
            case 8,6 -> System.out.println("hehe 60");
            default -> System.out.println("no hehe");
        }
        int a = switch (6){
            case 1,2,5 -> {
                yield 5;
            }
            case 8,6 -> {
                yield 6;
            }
            default -> {
                yield 5;
            }
        };

        System.out.println(a);

        String textblock = """
                hehe,
                 I am gaurav
                 <html>
                """;

        System.out.println(textblock);
    }
}
