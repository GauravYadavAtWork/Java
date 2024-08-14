package IOStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        BufferedOutputStream bufferedOutputStream = null;

        try {
            // Create a FileOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream("buffered_output.txt");

            // Wrap the FileOutputStream with a BufferedOutputStream
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            String data = "This is an example of using BufferedOutputStream.";

            // Write data to the buffer
            bufferedOutputStream.write(data.getBytes());

            // Flush the buffer to ensure all data is written to the file
            bufferedOutputStream.flush();

            System.out.println("Data written to buffered_output.txt successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedOutputStream != null) {
                    // Close the BufferedOutputStream
                    bufferedOutputStream.close();
                    System.out.println("BufferedOutputStream closed.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
