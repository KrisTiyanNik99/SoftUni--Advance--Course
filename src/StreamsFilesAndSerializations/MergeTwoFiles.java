package StreamsFilesAndSerializations;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String firstFilePath = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course\\src\\StreamsFilesAndSerializations" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String secondFilePath = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course\\src\\StreamsFilesAndSerializations" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        String firstContent = Files.readString(Path.of(firstFilePath));
        String secondContent = Files.readString(Path.of(secondFilePath));

        PrintWriter out = new PrintWriter("output.txt");
        out.println(firstContent);
        out.println(secondContent);
        out.close();
    }
}
