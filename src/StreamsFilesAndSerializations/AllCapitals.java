package StreamsFilesAndSerializations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course\\src\\StreamsFilesAndSerializations" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        String content = Files.readString(Path.of(path));

        content = content.toUpperCase();

        BufferedWriter out =
                new BufferedWriter(new FileWriter("output.txt"));

        out.write(content);
        out.close();
    }
}
