package com.company;

class ATM
{
    synchronized public void checkBalance(String name)
    {
        System.out.print(name + " checking ");
        try{ Thread.sleep(1000); }
        catch (Exception e) {}
        System.out.println("Balance");
    }

    synchronized public void withdraw(String name, int amount)
    {
        System.out.print(name + " withdrawing ");
        try{ Thread.sleep(1000); }
        catch (Exception e) {}
        System.out.println(amount);
    }

}


class Customer extends Thread
{
    String name;
    int amount;
    ATM atm;
    public Customer(String name, ATM atm, int amount)
    {
        this.name = name;
        this.atm = atm;
        this.amount = amount;
    }

    public void useATM()
    {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run()
    {
        useATM();
    }

}


public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();

        Customer c1 = new Customer("Smith", atm, 400);
        Customer c2 = new Customer("John", atm, 500);
        //Customer c3 = new Customer("Rushi", atm, 1000);

        c1.start();
        c2.start();
        //c3.start();
    }
}
