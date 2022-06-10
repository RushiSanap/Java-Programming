package com.company;

import java.security.PrivateKey;

class Account
{
    private String accountNo;

    private String name;

    private String address;

    private String phoneNo;

    private String DOB;

    protected long balance;

    public Account(String accountNo, String name, String address, String phoneNo, String DOB)
    {
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.DOB = DOB;
        balance = 0;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }

    public String  getAccountNo()
    {
        return accountNo;
    }

    public String getName()
    {
        return name;
    }

    public long getBalance()
    {
        return balance;
    }

    public String getAddress()
    {
        return address;
    }

    public String getDOB()
    {
        return DOB;
    }

    public String getPhoneNo()
    {
        return phoneNo;
    }
}

class SavingsAccount extends Account
{

    public SavingsAccount(String accountNo, String name, String address, String phoneNo, String DOB) {
        super(accountNo, name, address, phoneNo, DOB);
    }

    public void deposit(long amt)
    {
        balance = balance + amt;
    }

    public void withdraw(long amt)
    {
        if(amt < balance)
            balance = balance - amt;
        else
            System.out.println("Opps!Insufficient balance");
    }

}

class LoanAccount extends Account
{

    public LoanAccount(String accountNo, String name, String address, String phoneNo, String DOB) {
        super(accountNo, name, address, phoneNo, DOB);
    }

    public void EMI(long amt)
    {
        balance -= amt;
    }

    public void repay(int amt)
    {
        if(balance == amt)
            balance = 0;
    }
}


public class Main {

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("60226570716", "Rushikesh Sanap", "Nashik(sinnar)", "7030252226", "20/05/2000");
        sa.deposit(1200);
        sa.withdraw(300);
        System.out.println(sa.getBalance());
    }
}
