package Unit_3_JavaFeatures;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TryWithResource {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("output.txt"))){
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println("hehe");
        }catch (Exception e){
            e.getMessage();
        }
    }
}
