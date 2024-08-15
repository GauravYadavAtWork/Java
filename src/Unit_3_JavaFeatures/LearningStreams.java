package Unit_3_JavaFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearningStreams {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student(1, "Gaurav", 80));
        arr.add(new Student(2, "Sakshee", 95));
        arr.add(new Student(3, "Ishaan", 70));
        arr.add(new Student(4, "Kushgra", 75));


        List<Integer> l = arr.stream().map((s)->s.roll*2).toList();
        System.out.println(l);

        // map
        List<Student> l2 = arr.stream().filter((s)->s.marks>70).map(s->{
            s.marks = s.marks*2;
            return s;
        }).toList();
        System.out.println(l2);

        // map with custom return
        List<Student> l4 = arr.stream().map(s->{
            s.name = s.name + " hehe";
            return s;
        }).collect(Collectors.toList());
        System.out.println(l4);

        // sorted
        List<Student> l5 = arr.stream().sorted((s1, s2)-> s1.compare(s1, s2)).collect(Collectors.toList());
        System.out.println(l5);

        // max
        String maxmarksStudent = arr.stream().max((s1, s2)-> s1.compare(s1, s2)).get().name;
        System.out.println(maxmarksStudent);

        // min
        String minmarksStudent = arr.stream().min((s1, s2)-> s1.compare(s1, s2)).get().name;
        System.out.println(minmarksStudent);

        // count return long type
        long  lenofstream = arr.stream().filter(s-> s.marks>80).count();
        System.out.println("len of filtered data  : " +lenofstream);

        // forEach
        arr.stream().forEach(s->{
            System.out.println(s);
        });


        // of method
        Stream s = Stream.of(9,99,999,99999);
        s.forEach(item->{
            System.out.println(item);
        });


        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e"),
                Arrays.asList("f", "g", "h")
        );

        // Using flatMap to flatten the list of lists into a single list
        List<String> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList);

        // filter and takeWhile are different as when ever false is encountered , further processing is stoped while
        // while filter process all the elements of the stream even if it encounters false

        // dropWhile --> as any false is encountered further list is returned
        // initial true are not returned and when first false is encountered remaining stream is returneed

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(5);
        a1.add(9);
        a1.add(6);

        // Create a stream from the ArrayList elements
        Stream<Integer> s1 = a1.stream();

        // Apply filter operation
        List<Integer> filteredList = s1.filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println("Filtered (even numbers): " + filteredList);

        // Re-create the stream because the previous stream is already consumed
        Stream<Integer> s2 = a1.stream();

        // Apply takeWhile operation
        List<Integer> takeWhileList = s2.takeWhile(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println("TakeWhile (until odd number): " + takeWhileList);

        // Re-create the stream again
        Stream<Integer> s3 = a1.stream();

        // Apply dropWhile operation
        List<Integer> dropWhileList = s3.dropWhile(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println("DropWhile (remove leading evens): " + dropWhileList);


        // iterate
        System.out.println(Stream.iterate(1,x->x+2).limit(10).collect(Collectors.toList()));
        System.out.println(Stream.iterate(1,x->x<20,x->x+2).collect(Collectors.toList()));
    }
}
