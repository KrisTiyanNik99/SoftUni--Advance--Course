package StreamsFilesAndSerializations;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course" +
                "\\src\\StreamsFilesAndSerializations\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputFileStream =
                new FileInputStream(path);

        // Чрез метода "read" се чете по 1 буква от файла
        int oneByte = inputFileStream.read();

        // Ще върти докато условието е различно от -1 защото когато няма повече информация във файла InputStream ще върне -1
        while (oneByte != -1){

            System.out.print(oneByte);
            oneByte = inputFileStream.read();
        }
    }
}
