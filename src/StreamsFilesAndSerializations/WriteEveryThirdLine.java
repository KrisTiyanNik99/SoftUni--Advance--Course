package StreamsFilesAndSerializations;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) {
        String path = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course" +
                "\\src\\StreamsFilesAndSerializations\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try (BufferedReader in =
                     new BufferedReader(new FileReader(path))) {
            PrintWriter out =
                    new PrintWriter(new FileWriter("output.txt"));

            int counter = 1;
            String line = in.readLine();
            while (line != null) {
                if (counter % 3 == 0) {
                    out.println(line);
                }

                counter++;
                line = in.readLine();
            }

            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
