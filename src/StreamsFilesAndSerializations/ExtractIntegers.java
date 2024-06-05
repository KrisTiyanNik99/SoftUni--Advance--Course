package StreamsFilesAndSerializations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course" +
                "\\src\\StreamsFilesAndSerializations\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        // Можем да четем файлове и със скенер, който като аргумент ще взима FileInputStream
        Scanner scanner =
                new Scanner(new FileInputStream(path));
        // Можем да пишем с PrintWriter
        PrintWriter out =
                new PrintWriter(new FileOutputStream("output.txt"));

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                out.println(scanner.nextInt());
            }

            scanner.next();
        }

        out.close();
    }
}
