package StreamsFilesAndSerializations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course\\src\\StreamsFilesAndSerializations" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        String content = Files.readString(Path.of(path));
        content = content.replaceAll("\\s+", "");

        int vowel = 0;
        int punctuation = 0;
        int others = 0;
        for (char symbol : content.toCharArray()) {

            if (isVowel(symbol)) {
                vowel++;
            } else if (isPunctuation(symbol)) {
                punctuation++;
            } else {
                others++;
            }
        }

        PrintWriter out = new PrintWriter("output.txt");
        out.println("Vowels: " + vowel);
        out.println("Other symbols: " + others);
        out.println("Punctuation: " + punctuation);

        out.close();
    }

    private static boolean isPunctuation(char symbol) {
        return symbol == ',' || symbol == '!' || symbol == '.' || symbol == '?';
    }

    private static boolean isVowel(char symbol) {
        return symbol == 'a' || symbol == 'e' || symbol == 'i'
                || symbol == 'o' || symbol == 'u';
    }
}
