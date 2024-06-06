package StreamsFilesAndSerializations;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course\\src\\StreamsFilesAndSerializations" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";

        List<String> lines = Files.readAllLines(Path.of(path));
        PrintWriter out = new PrintWriter("output.txt");

        for (int i = 0; i < lines.size(); i++) {
            String line = String.format("%d. %s", i + 1, lines.get(i));
            out.println(line);
        }

        out.close();
    }
}
