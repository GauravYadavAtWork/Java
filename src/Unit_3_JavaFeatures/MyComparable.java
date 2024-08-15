package Unit_3_JavaFeatures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class mycomparator1 implements Comparator<MyComparable>{
    @Override
    public int compare(MyComparable o1, MyComparable o2) {
        return  - o1.marks + o2.marks;
    }
}

public class MyComparable implements Comparable<MyComparable> {
    int marks;
    int id;

    MyComparable(int m, int i){
        marks = m;
        id = i;
    }

    @Override
    public  int compareTo(MyComparable o) {
        return this.marks - o.marks;
    }

    @Override
    public String toString() {
        return this.marks + " ";
    }

    public static void main(String[] args) {
        ArrayList<MyComparable> arr = new ArrayList<>();
        arr.add(new MyComparable(45,12));
        arr.add(new MyComparable(89,12));
        arr.add(new MyComparable(97,12));
        arr.add(new MyComparable(74,12));
        arr.add(new MyComparable(89,12));

        arr.sort(MyComparable::compareTo); // ascending order using comparable
        System.out.println("ascending "+arr.toString());
        arr.sort(new mycomparator1());     // descending order using comparator
        System.out.println("descending " +arr);
        Collections.sort(arr, MyComparable::compareTo);
        System.out.println(arr);
    }
}
