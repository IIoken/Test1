import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что нибуть:");
        int operand1 = scanner.nextInt();

        while (true) {
            char operation = scanner.next().charAt(0);
            int operand2 = scanner.nextInt();
            int equals = 0;
            switch (operation) {
                case '+':
                    equals = operand1 + operand2;
                    break;
                case '-':
                    equals = operand1 - operand2;
                    break;
                case '/':
                    equals = operand1 / operand2;
                    break;
                case '*':
                    equals = operand1 * operand2;
                    break;
                default:
                    System.out.println("Не правильное ввели значение");
            }

            System.out.println("Ваш ответ:" + equals);
        }
    }
}