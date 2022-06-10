package com.company;

enum Dept
{
    CS, IT, CIVIL,MECHANICAL,META;
    //constructor should be private of default only
    //it is executed at the time of loading
    private Dept()
    {
        System.out.println(this.name());
    }

    public void display()
    {
        System.out.println(this.name() + " " + this.ordinal());
    }
}

public class Main {

    public static void main(String[] args) {

        Dept list[] = Dept.values();

        //Dept y = Dept.valueOf("IT");
        //System.out.println(y);

        for(Dept x:list)
            x.display();

        Dept d = Dept.CS;
        /*switch (d)
        {
            case CS:System.out.println("Head:John\nBlock:A");
                break;

            case IT:System.out.println("Head:Smith\nBlock:B");
                break;

            case CIVIL:System.out.println("Head:Martin\nBlock:C");
                break;

            case MECHANICAL:System.out.println("Head:Luther\nBlock:D");
                break;

            case META:System.out.println("Head:King\nBlock:E");
                break;
        }*/

    }
}
