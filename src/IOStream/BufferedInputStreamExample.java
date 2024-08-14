package IOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;

        try {
            // Create a FileInputStream
            FileInputStream fileInputStream = new FileInputStream("example.txt");

            // Wrap the FileInputStream with a BufferedInputStream
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            int data;
            // Read the file byte by byte using BufferedInputStream
            while ((data = bufferedInputStream.read()) != -1) {
                // Print the character
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedInputStream != null) {
                    // Close the BufferedInputStream
                    bufferedInputStream.close();
                    System.out.println("\nBufferedInputStream closed.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
