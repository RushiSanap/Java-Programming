package com.company;

class HondaCity
{
    public static long price = 1299999;

    public int a,b;

    static public double onRoadPrice(String city)
    {
        switch (city)
        {
            case "Delhi":
                return price + 0.1*price;

            case "Mumbai":
                return price + 0.09*price;
        }
        return 0;
    }

}

public class Main {

    public static void main(String[] args) {
	    HondaCity h = new HondaCity();
	    System.out.println(HondaCity.price);
	    System.out.format("%.3f",HondaCity.onRoadPrice("Delhi"));
    }
}
