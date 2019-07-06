package Zadanie3;

import java.util.Scanner;

public class Massiv {
     void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //создаем метод ввода в консоль

        System.out.println("Укажите размер массива:"); /*выводим сообщение для
        пользователя, которое оповещает о том, что можно ввести число в консоль*/
        int i = scanner.nextInt(); //создаем переменную в которою будет помещен результат ввода пользователя(число)

        String[] mas = new String[i]; //создаем массив
        System.out.println("Введите элементы массива:"); /*выводим сообщение для
        пользователя, которое оповещает о том, что можно ввести число в консоль*/
        for (int position = 0; position < mas.length; position++) {
            String s = scanner.next();
            mas[position] = s;
        }

        int size = -1;
        int pos = -1;
        for (int position2 = 0; position2 < mas.length; position2++) {
            String element = mas[position2];
            if (size < element.length()) {
                size = element.length();
                pos = position2;
            }
        }
        System.out.println("Максимальный элемент в массиве : " + mas[pos]); //выводим сообщение с результатом в консоль
    }
}