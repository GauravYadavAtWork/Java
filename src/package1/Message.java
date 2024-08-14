package package1;

public class Message{

    String message ;

    public Message(String str){
        this.message = str;
    }

    public void sayMyMessage(){
        System.out.println(message);
    }

    public static void message(){
        System.out.println("This is a message from Message class");
    }

}
