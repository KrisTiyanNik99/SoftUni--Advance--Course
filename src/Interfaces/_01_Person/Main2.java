package Interfaces._01_Person;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        // Взимаме всички интерфейси на класа Citizen
        Class[] citizenInterfaces = Citizen.class.getInterfaces();

        // Проверявам дали в тези интерфейси се намира интерфейса Person
        if(Arrays.asList(citizenInterfaces).contains(Person.class)){

            // Вземам всички дефинирани методи дефинирани в интерфейса Person
            Method[] fields = Person.class.getDeclaredMethods();

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());

            Person person = new Citizen(name,age);

            System.out.println(fields.length);
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }

    }
}
