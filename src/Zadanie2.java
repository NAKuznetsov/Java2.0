import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //создаем метод ввода в консоль
        System.out.println("Этот калькулятор умеет складывать дробные числа. Введите первое число:"); /*выводим сообщение для
        пользователя, которое оповещает о том, что можно ввести число в консоль*/
        double i = scanner.nextDouble(); //создаем переменную в которою будет помещен результат ввода пользователя
        System.out.println("Введите второе число:"); /*выводим сообщение для
        пользователя, которое оповещает о том, что можно ввести число в консоль*/
        double j = scanner.nextDouble(); //создаем другую переменную в которою будет помещен результат ввода пользователя

        double x = i + j; //производим сложение двух переменных

        System.out.printf("Результат: %.4f" + "\n",x); //выводим сообщение с результатом в консоль
    }
}