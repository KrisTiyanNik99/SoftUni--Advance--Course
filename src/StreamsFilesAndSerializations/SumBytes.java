package StreamsFilesAndSerializations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course\\src\\StreamsFilesAndSerializations" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader in = new BufferedReader(new FileReader(path));
        //Scanner in = new Scanner(new FileReader(path));

        String line = in.readLine();
        int sum = 0;
        while (line != null) {

            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }

            line = in.readLine();
        }

        System.out.println(sum);
    }
}
