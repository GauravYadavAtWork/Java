package generics;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());

        list.remove();
        System.out.println("List after removal: " + list);

        System.out.println("Get element at index 0: " + list.get(0));
        list.set(0, 100);
        System.out.println("List after setting index 0 to 100: " + list);
    }
}
