package StreamsFilesAndSerializations;

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) {
        String path = "C:\\Users\\Kris\\Desktop\\SoftUni--Advance--Course" +
                "\\src\\StreamsFilesAndSerializations\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try (InputStream in = new FileInputStream(path)){
            OutputStream out = new FileOutputStream("output.txt");

            int oneByte = in.read();
            while (oneByte != -1){
                // Тук правим проверка за аски кода за нов ред или празно място
                if (oneByte == 10 || oneByte == 32){
                    out.write(oneByte);
                }else {
                    // От тук взимаме числото като стринг - 79 -> "79"
                    String digit = String.valueOf(oneByte);
                    for (int i = 0; i < digit.length(); i++) {
                        // Обикаляме всяко като "char" и го записваме
                        out.write(digit.charAt(i));
                        // Пример: първо '7' после '9' на второто завъртане
                    }
                }

                oneByte = in.read();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
