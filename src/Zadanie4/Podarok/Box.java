package Zadanie4.Podarok;

import java.util.ArrayList;
import java.util.List;

public class Box
{
    private List<Info> sostav = new ArrayList<>();
    private double totalPrice = 0;
    private double totalWeight = 0;

    void addSweet(Info info)
    {
        System.out.println("Положили в подарок: " + info);
        sostav.add(info);
        totalPrice += info.getPrice();
        totalWeight += info.getWeight();
    }

    List<Info> getSostav()
    {
        return sostav;
    }

    double getTotalPrice()
    {
        return totalPrice;
    }

    double getTotalWeight()
    {
        return totalWeight;
    }
}
