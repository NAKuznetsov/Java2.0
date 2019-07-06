package Zadanie4.Podarok;
import Zadanie4.Podarok.Sweets.Candy;
import Zadanie4.Podarok.Sweets.Cookie;



public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Начинаем собирать подарок!");
        Box podarok = new Box();
        podarok.addSweet(new Candy(45, 333,"Мишки в лесу"));
        podarok.addSweet(new Cookie(99, 221, 4));
        System.out.println("Общий вес: " + podarok.getTotalWeight() + ", общая стоимость: " + podarok.getTotalPrice());
        System.out.println("Состав подарка: " + podarok.getSostav());
        System.out.println("Завершили собирать подарок.");
    }
}
