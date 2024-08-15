package Comparators;

import java.util.ArrayList;
import java.util.Comparator;

class PeopleComparator implements Comparator<People>{
    @Override
    public int compare(People o1, People o2) {
        return  - o1.age  + o2.age;
    }
}

public class People  implements Comparable<People>{
    int height;
    int age;
    String name;

    People(String name, int age, int height){
        this.height = height;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(People o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "{ " + this.name + ", " + this.age + ", " + this.height + " }";
    }

    public static void main(String[] args) {
        ArrayList<People> peoples = new ArrayList<>();
        peoples.add(new People("Gaurav", 96, 56));
        peoples.add(new People("sakshee", 6, 56));
        peoples.add(new People("kushagra", 86, 56));
        peoples.add(new People("ishaan", 15, 56));
        peoples.add(new People("ppp", 86, 56));

        peoples.sort(People::compareTo);
        System.out.println(peoples);

        peoples.sort(new PeopleComparator());
        System.out.println(peoples);


    }
}
