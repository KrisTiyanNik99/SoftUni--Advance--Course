package StreamsFilesAndSerializations;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course\\src\\StreamsFilesAndSerializations\\04. " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File root = new File(filePath);

        Deque<File> directs = new ArrayDeque<>();
        // Запазваме всички файлове в опашка
        directs.offer(root);

        int counter = 0;
        while (!directs.isEmpty()) {
            File current = directs.poll();
            // Взимаме всички файлове обратно (директориите също)
            File[] files = current.listFiles();

            // Преминаваме през всеки файл
            for (File file : files) {
                // Правим проверка на това дали текущия файл е директория
                if (file.isDirectory()) {
                    // Ако е директория я добавяме към опашката за да може да повторим всичко
                    directs.offer(file);
                }
            }

            counter ++;
            System.out.println(current.getName());
        }

        System.out.println(counter + " folders");
    }
}
