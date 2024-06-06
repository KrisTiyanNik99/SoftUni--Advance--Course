package StreamsFilesAndSerializations;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        String path = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course\\src\\StreamsFilesAndSerializations" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        int size = 0;
        File folder = new File(path);

        for (File file : folder.listFiles()) {
            size += file.length();
        }

        System.out.println("Folder size: " + size);
    }
}
