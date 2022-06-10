package com.company;

import java.io.*;
import java.util.Scanner;

class Customer implements Serializable
{
    private static int count = 0;
    private String customerID = "C" + ++count;
    public String name;
    private String mobileNo;

    public Customer(){}

    public Customer(String name, String mobileNo)
    {
        this.name = name;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString()
    {
        return "Customer Details" +
                "\nCustomer ID = " + customerID +
                "\nName = " + name +
                "\nMobile number = " + mobileNo + "\n";
    }
}

public class Main {

    public static void main(String[] args) {
        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\SerializationOfCustomer\\Customer.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int x  = ois.readInt();
            Customer list[] = new Customer[x];
            for(int i = 0; i < x; i++)
            {
                list[i] = (Customer) ois.readObject();
            }

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the name of customer ");
            String name  = scan.nextLine();

            for(int i = 0; i < x; i++)
            {
                if(name.equalsIgnoreCase(list[i].name)){
                    System.out.println(list[i]);
                }
            }

            ois.close();
            fis.close();

        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
