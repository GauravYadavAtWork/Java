package Strings;

public class LearingString {
    public static void main(String[] args) {
//        String str = "Gaurav";
//        String str1 = new String("Sakshee");
//        char []arrc = {'I', 's', 'h', 'a', 'a', 'n'};
//        String str2 = new String(arrc);
//        System.out.println(str);
//        System.out.println(str.concat(str1));
//        System.out.println(str.compareTo(str1));

        StringBuilder s1 = new StringBuilder("Gaurav ");
        StringBuilder s2 = new StringBuilder("Yadav ");
        String s = s1.append(s2).toString();
        System.out.println(s);
        System.out.println(s2);
    }
}
