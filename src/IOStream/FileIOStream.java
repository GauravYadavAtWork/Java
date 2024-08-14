package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            // Writing data to a file using FileOutputStream
            outputStream = new FileOutputStream("output.txt");
            String dataToWrite = "Hello, World!";

            // Write data
            outputStream.write(dataToWrite.getBytes());

            // Flush the output stream (force any buffered output bytes to be written out)
            outputStream.flush();
            System.out.println("Data written to output.txt successfully.");

            // Reading data from the file using FileInputStream
            inputStream = new FileInputStream("output.txt");

            // Check the number of bytes available to read
            System.out.println("Available bytes in the file: " + inputStream.available());

            int data;
            // Read the file byte by byte
            while ((data = inputStream.read()) != -1) {
                // Print the character
                System.out.print((char) data);
            }
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the input stream
                if (inputStream != null) {
                    inputStream.close();
                    System.out.println("FileInputStream closed.");
                }
                // Close the output stream
                if (outputStream != null) {
                    outputStream.close();
                    System.out.println("FileOutputStream closed.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
