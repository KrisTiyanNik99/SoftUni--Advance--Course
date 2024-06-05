package StreamsFilesAndSerializations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String directory = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course" +
                "\\src\\StreamsFilesAndSerializations\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        String outDir = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course\\output.txt";

        Path inFile = Paths.get(directory);
        Path outFile = Paths.get(outDir);

        List<String> lines = Files.readAllLines(inFile);
        lines = lines.stream().filter(l ->
                !l.isBlank()).collect(Collectors.toList());

        Collections.sort(lines);
        Files.write(outFile, lines);
    }
}
