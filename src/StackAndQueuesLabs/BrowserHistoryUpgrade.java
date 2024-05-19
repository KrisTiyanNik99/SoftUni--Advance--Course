package StackAndQueuesLabs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Взимаме инпута
        String input = scanner.nextLine();

        // Създавам стак който ще пази всички идващи url
        ArrayDeque <String> stackURLs = new ArrayDeque<>();

        // Този стек ще се пълни само когато имаме "back" команда, в противен случай ни трябва празен
        ArrayDeque <String> forwardsQueue = new ArrayDeque<>();

        while (!input.equals("Home")){

            // Когато командата е "back"
            if (input.equals("back")){

                if (stackURLs.size() < 2){
                    System.out.println("no previous URLs");
                }

                else {

                    // Запазваме последно въведения url защото само когато имаме команда "back" ни трябва да се върнем
                    String currentURL = stackURLs.pop();
                    // Запазваме сегашния- последно въведения url
                    forwardsQueue.push(currentURL);
                    // Принтираме стария
                    System.out.println(stackURLs.peek());
                }
            }
            // Когато командата е "forward"
            else if (input.equals("forward")){

                // Проверяваме дали стека е празен
                if (forwardsQueue.isEmpty()){
                    System.out.println("no next URLs");
                }
                else {
                    // Ако не е празен взимаме последно добавения елемент
                    String currentForward = forwardsQueue.pop();
                    System.out.println(currentForward);
                    stackURLs.push(currentForward);
                }
            }
            else {
                // Добавяме всеки url и го принтираме
                stackURLs.push(input);
                System.out.println(input);
                // Изчистваме винаги стека с url който за напред
                forwardsQueue.clear();
            }

            input = scanner.nextLine();
        }
    }
}