package com.company;

interface member
{
   void callback();
}

class Store
{
    member mem[] = new member[100];

    int count = 0;

    public void registered(member m)
    {
        mem[count++] = m;
    }

    public void inviteSale()
    {
        for(int i = 0; i < count; i++)
            mem[i].callback();
    }
}

class Customer implements member
{
    private String name;

    Customer(String name)
    {
        this.name = name;
    }

    @Override
    public void callback()
    {
        System.out.println("Okay, I'll visit, " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        Store s = new Store();

        Customer c1 = new Customer("Rushikesh");
        Customer c2 = new Customer("Vikas");

        s.registered(c1);
        s.registered(c2);

        s.inviteSale();
    }
}
