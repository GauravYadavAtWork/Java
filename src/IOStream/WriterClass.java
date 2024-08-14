package IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class WriterClass {
    public static void main(String[] args) {
        FileWriter writer = null;

        try {
            // Create a FileWriter object to write to a file
            writer = new FileWriter("output.txt");

            // Write a string to the file
            writer.write("Hello, World!\n");

            // Write another string to the file
            writer.write("This is a FileWriter example.");

            System.out.println("Data written to output.txt successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    // Close the writer to release resources
                    writer.close();
                    System.out.println("FileWriter closed.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
