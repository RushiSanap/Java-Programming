package com.company;

import java.security.PublicKey;

enum Dept
{
    CS("John", "Block A"),IT("Dave", "Block B"),CIVIL("Don", "Block C"),ECE("Smith", "Block D");
    String head;
    String location;

    private Dept(String head, String location)
    {
        this.head = head;
        this.location = location;
    }

    public void display()
    {
        System.out.println(this.name() + " " + this.ordinal());
    }

    public String getHead()
    {
        return head;
    }

    public String getLocation()
    {
        return location;
    }
}

public class Main {

    public static void main(String[] args) {
        Dept d = Dept.CS;
        System.out.println(d.getHead());
        System.out.println(d.getLocation());

    }
}
