package StreamsFilesAndSerializations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course" +
                "\\src\\StreamsFilesAndSerializations\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try {
            FileInputStream in = new FileInputStream(path);
            FileOutputStream out = new FileOutputStream("output.txt");

            // Създаваме лист със знаците които искаме да премахнем от текста
            List<Character> symbols = new ArrayList<>();
            Collections.addAll(symbols, '.', ',', '!', '?');

            int oneByte;
            // Започваме да прочитаме всеки един отделен знак който се съдържа във файла
            while ((oneByte = in.read()) != -1) {
                // Правим проверка дали листа не съдържа сегашния прочетен char от файла, който четем
                if (!symbols.contains((char) oneByte)) {
                    // Ако прочетеният char не се съдържа в списъка с четени елементи значи го отпечатваме в новия файл
                    out.write(oneByte);
                }
                //oneByte = in.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
