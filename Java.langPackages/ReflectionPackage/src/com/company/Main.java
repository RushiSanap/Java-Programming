package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.zip.CheckedOutputStream;

class My
{
    public int a;
    protected int b;
    private int c;
    int d;

    public My() {}
    public My(int x, int y){}

    public void setA(int a){}
    public void setB(int b){}
    public void add(int a, int b){}
    public void add(int a, int b, int c){}
}

public class Main {

    public static void main(String[] args) {
        //My m = new My();
        //Class c1 = m.getClass();
        Class c = My.class;
        Field field[] = c.getDeclaredFields();//all the declared properties of the class
        System.out.println("Properties of My class:");
        for(Field f:field)
            System.out.println(f);

        System.out.println("\nConstructors of My class:");
        Constructor con[] = c.getConstructors();
        for(Constructor ct:con)
            System.out.println(ct);

        System.out.println("\nUser defined as well as inherited methods of My class:");
        Method method1[] = c.getMethods();//all the user defined as well as inherited methods of the class
        for(Method m : method1)
            System.out.println(m);

        System.out.println("\nUser defined methods of My class:");
        Method method[] = c.getDeclaredMethods();//all the user defined methods of the class
        for(Method m : method)
            System.out.println(m);

        System.out.println("\nParameters of method 0:");
        Parameter param[] = method[0].getParameters();
        for(Parameter p:param)
            System.out.println(p);






;

    }
}
