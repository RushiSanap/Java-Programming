package com.company;

class CoffeeMachine {
    private float coffeeQty;

    private float waterQty;

    private float sugarQty;

    private float milkQty;

    static private CoffeeMachine my = null;

    static int count = 0;

    private CoffeeMachine() {
        coffeeQty = 1f;
        waterQty = 1f;
        sugarQty = 1f;
        milkQty = 1f;
    }

    public void fillWater(float qty)
    {
        waterQty = qty;
    }

    public void fillSugar(float qty)
    {
        sugarQty = qty;
    }

    public float getCoffeeQty()
    {
        return coffeeQty;
    }

    static public CoffeeMachine getInstance()
    {
        if(my == null){
            //count++;
            return my = new CoffeeMachine();
        }
        return my;
    }

}


public class Main {

    public static void main(String[] args) {
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        CoffeeMachine c2 = CoffeeMachine.getInstance();
        CoffeeMachine c3 = CoffeeMachine.getInstance();

        if(c1 == c2 && c1 == c3)
            System.out.println("same");
        System.out.println(c1 + " " + c2 + " " + c3);

    }
}
