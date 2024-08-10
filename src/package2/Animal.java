package package2;

public class Animal {
    String name;
    Animal(String str){
        this.name = str;
    }
    void sayName(){
        System.out.println("This is "+ name);
    }
}

class Tiger extends Animal{
    Tiger(){
        super("Tiger");
    }
}

