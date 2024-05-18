package StackAndQueuesLabs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        // Слагаме стойността на null за да може при проверката да изостане с 1 назад
        String url = null;

        ArrayDeque<String> urls = new ArrayDeque<>();
        while (!command.equals("Home")){

            if (command.equals("back")){
                // Проверка дали стека е празен
                if (urls.isEmpty()){
                    System.out.println("no previous URLs");
                }else {
                    // Ако не е празен стека, махаме стойността и я запазваме в url
                    url = urls.pop();
                    // В случая pop ще ни запази запази страницата на която "трябва" да е потребителя след back
                    System.out.println(url);
                    // При следващата интерация попнатия елемент ще се запази в стека
                }

            // Искаме да запазим старата стойност на "url" в стека само когато имаме нов url който получаваме
            }else {
                // Правим проверка дали стойността на url е null и ако не е запазваме необновената му стойност
                // Тук винаги запазваме първо старата и не обновена версия на "url" променливата
                if (url != null){
                    // Запазваме необновената (старата) стоност в стека
                    urls.push(url);
                }
                // След като сме запазили необновената стойност, просто я обновяваме като я правим да е равна на новата
                url = command;
                System.out.println(url);
            }

            command = scanner.nextLine();
        }
    }
}