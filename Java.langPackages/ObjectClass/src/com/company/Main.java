package com.company;


class MyObject1
{
    @Override
    public String toString()
    {
        return "My object";
    }

    @Override
    public int hashCode()
    {
        return 100;
    }

    @Override
    public boolean equals(Object o)
    {
        return this.hashCode() == o.hashCode();
    }
    //we cannot override wait and notify and notifyAll methods since they are final

}

public class Main {

    public static void main(String[] args) {
        MyObject1 ob = new MyObject1();
        MyObject1 ob1 = new MyObject1();
        System.out.println(ob.equals(ob1));
    }
}
