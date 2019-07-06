package Zadanie4.Podarok.Sweets;

import Zadanie4.Podarok.Info;

public class Cookie implements Info
{

    private double cookieWeight;
    private double cookiePrice;
    private int amount;

    public Cookie(double cookieWeight, double cookiePrice, int amount)
    {
        this.cookieWeight = cookieWeight;
        this.cookiePrice = cookiePrice;
        this.amount = amount;
    }

    @Override
    public double getWeight()
    {
        return this.cookieWeight;
    }

    @Override
    public double getPrice()
    {
        return this.cookiePrice;
    }

    private int getAmount()
    {
        return amount;
    }

    @Override
    public String toString()
    {
        return "Количество печенья в пачке: " + getAmount() + " штук";
    }
}
