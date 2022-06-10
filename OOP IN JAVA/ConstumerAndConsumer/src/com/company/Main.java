package com.company;

class Product
{
    private String itemNo;

    private String itemName;

    private float itemPrice;

    private short itemQuantity;

    public void setItemPrice(float price)
    {
        if(itemPrice > 0)
            itemPrice = price;
    }

    public void setItemQuantity(short quantity)
    {
        if(itemQuantity > 0)
            itemQuantity = quantity;
    }

    public Product(String no, String name)
    {
        itemNo = no;
        itemName = name;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
