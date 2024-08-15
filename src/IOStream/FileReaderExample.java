package IOStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        FileReader reader = null;

        try {
            // Create a FileReader object to read from a file
            reader = new FileReader("output.txt");

            int data;
            // Read the file character by character
            while ((data = reader.read()) != -1) {
                // Print the character
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    // Close the reader to release resources
                    reader.close();
                    System.out.println("\nFileReader closed.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

