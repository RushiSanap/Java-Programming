package com.company;

class Car
{
    public void start()
    {
        System.out.println("started");
    }

    public void changeGear()
    {
        System.out.println("Gear of car is changed");
    }

    public void accelerate()
    {
        System.out.println("accelerated");
    }
}

class LuxuryCar extends Car
{
    @Override
    public void changeGear()
    {
        System.out.println("Automatic gear");
    }

    public void openRoof()
    {
        System.out.println("Roof is opened");
    }
}

public class Main {

    public static void main(String[] args) {
        LuxuryCar lc = new LuxuryCar();
        lc.accelerate();
        lc.openRoof();

    }
}
