package Filehandling;

import java.io.File;

public class FileHandling {
    public static void main(String[] args) {
        // Creating a File object
        File file = new File("example.txt");

        // Printing the file name
        System.out.println("File name: " + file.getName());

        // Printing the absolute path
        System.out.println("Absolute path: " + file.getAbsolutePath());

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

        // Check if the file can be read
        System.out.println("Can read: " + file.canRead());

        // Check if the file can be written
        System.out.println("Can write: " + file.canWrite());

        File directory = new File("newDirectory");

        // Create a directory
        if (directory.mkdir()) {
            System.out.println("Directory created.");
        } else {
            System.out.println("Directory creation failed.");
        }

        // Delete the file
        if (file.delete()) {
            System.out.println("File deleted.");
        } else {
            System.out.println("File deletion failed.");
        }

    }
}
