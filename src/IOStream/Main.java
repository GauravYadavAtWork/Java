package IOStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            // Open the file input stream
            inputStream = new FileInputStream("example.txt");

            int data;
            // Read the file byte by byte
            while ((data = inputStream.read()) != -1) {
                // Print the character
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    // Close the input stream
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

