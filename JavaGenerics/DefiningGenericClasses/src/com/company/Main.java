package com.company;

class Data<T>
{
    private T obj;

    public void setObj(T t)
    {
        obj = t;
    }

    public T getObj()
    {
        return obj;
    }
}

class MyArray<T>
{
    @SuppressWarnings("unchecked")
    private T arr[] =(T[]) new Object[10];

    private int pointer = 0;

    public void append(T x)
    {
        arr[pointer++] = x;
    }

    public void display()
    {
        System.out.print("{ ");
        for(int i = 0; i < pointer; i++)
            System.out.print(arr[i] + " ");
        System.out.print("}");
    }

}

public class Main {

    public static void main(String[] args) {
        Data<String> d= new Data<>();
        d.setObj("Hi");
        System.out.println(d.getObj());

        Data<Integer> d1 = new Data<>();
        d1.setObj(10);
        System.out.println(d1.getObj());

        MyArray<Integer> i = new MyArray<>();
        i.append(10);
        i.append(20);
        i.append(30);
        i.append(40);
        i.display();
    }
}
