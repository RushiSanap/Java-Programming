package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable
{
    private static int count = 0;
    private String customerID = "C" + ++count;;
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
        return "Customer " + ++count + " Details" +
                "\nCustomer ID = " + customerID +
                "\nName = " + name +
                "\nMobile number = " + mobileNo;
    }
}

public class Main {

    public static void main(String[] args) {
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\SerializationOfCustomer\\Customer.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            /*Customer c[] = new Customer[4];
            c[0] = new Customer("Rushikesh", "7030252226");
            c[1] = new Customer("Vikas", "8668842533");
            c[2] = new Customer("Ritesh", "8080289912");
            c[4] = new Customer("Omkar", "9764382856");*/

            Customer list[] = {new Customer("Rushikesh", "7030252226"),new Customer("Vikas", "8668842533"),new Customer("Ritesh", "8080289912"),new Customer("Omkar", "9764382856")};
            int x = list.length;
            oos.writeInt(x);
            for(Customer c : list)
                oos.writeObject(c);

            oos.close();
            fos.close();

        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
