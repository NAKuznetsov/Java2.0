package Zadanie4.Podarok.Sweets;

import Zadanie4.Podarok.Info;

public class Candy implements Info
{
    private double candyWeight;
    private double candyPrice;
    private String name;

    public Candy(double candyWeight, double candyPrice, String name)
    {
        this.candyWeight = candyWeight;
        this.candyPrice = candyPrice;
        this.name = name;
    }

    public double getWeight()
    {
        return this.candyWeight;
    }

    public double getPrice()
    {
        return this.candyPrice;
    }

    private String getName()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        return "Название конфеты: " + getName();
    }
}
