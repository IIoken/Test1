import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Создаём сканер для приём данных от пользователя
        Scanner console = new Scanner(System.in);
        //Создаём максимальное число попыток
        System.out.println("Введене максимальное число попыток");
        int maxPopytok = console.nextInt();
        //Нижний предел вводимого числа
        System.out.println("Нижний предел:");
        int Min = console.nextInt();
        // верхний предел вводимого числа
        System.out.println("Верхний предел");
        int Max = console.nextInt();

        //Создаем экземпляр класса Random()
        Random rand = new Random();

        //Создаем переменную типа int
        int randInt;
        //Сохраняем случайное число в переменной randInt чтобы неболо ниже минимального числа +  рандом из мак и мин + 1;
        randInt = Min + rand.nextInt(Max - Min + 1) ;
        // для мин числа максимальных попыток
        int conture = 1;
        //создаем булеву переменную для сохранения статуса «угадал/не угадал»
        boolean status = false;
        //делаем цыкл для определиния числа (записываем что максимальное чило попыток должно быть не менее 1(conture)
        while (conture <= maxPopytok) {
            System.out.println("Видите число: ");
            // сохраняем случайное число которое ввёл пользователь
            int userInput = console.nextInt();
            // Создаём проверку условий
            if (userInput == randInt) {
                System.out.println("Совершенно верно!!!");
                status = true;
                break;
            }else if (userInput >= randInt) {
                System.out.println("Заданное мною число меньше");
                status = false;
            } else {
                System.out.println("Заданное мною число больше");
                status = false;
            }
            conture++;
        }
        // проверка угоданности
        if (status == false) {
            System.out.println("Конец игры");
            System.out.println("Мною было загадано число:" + randInt);
        }
    }
}