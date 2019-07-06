package Zadanie3;

import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Kalkul kalkul = new Kalkul();
        Massiv massiv = new Massiv();

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Какую программу вы хотите запустить?");
        System.out.println("1 - Калькулятор");
        System.out.println("2 - Массив");

        int a = scanner.nextInt();

        if (a==1)
        {
            kalkul.main(args);
        }

        if (a==2)
        {
            massiv.main(args);
        }

        else
        {
            System.out.println("Вы указали неверный номер программы!!");
        }
    }
}
