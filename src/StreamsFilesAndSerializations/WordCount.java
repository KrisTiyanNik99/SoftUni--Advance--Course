package StreamsFilesAndSerializations;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String wordPath = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course\\src\\" +
                "StreamsFilesAndSerializations\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String inputPath = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course\\src" +
                "\\StreamsFilesAndSerializations\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";

        List<String> words = Arrays.stream(Files.readString(Path.of(wordPath)).split("\\s+")).toList();
        String text = Files.readString(Path.of(inputPath));

        Map<String, Integer> wordCount = new LinkedHashMap<>();

        for (String word : text.split("\\s+")) {

            if (words.contains(word)) {
                wordCount.putIfAbsent(word, 0);
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }

        PrintWriter out = new PrintWriter("output.txt");

        wordCount.entrySet().forEach(e -> out.println(e.getKey() + " - " + e.getValue()));
        out.close();
    }
}
