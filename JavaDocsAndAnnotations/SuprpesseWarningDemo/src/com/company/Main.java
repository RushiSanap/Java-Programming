package com.company;

class Old
{
    public void display()
    {
        System.out.println("Hello");
    }

    @Deprecated
    public void show()
    {
        System.out.println("Welcome");
    }
}

class My<T>
{
    @SafeVarargs
    private void display(T... args)
    {
        for(T x:args)
            System.out.println(x);
    }
}
public class Main {

    @SuppressWarnings("Deprecation")
    public static void main(String[] args) {
        Old o = new Old();
        o.show();
    }
}
