package com.company;

import java.util.Scanner;

class StackUnderFlowException extends Exception
{
    @Override
    public String toString()
    {
        return "Stack is Empty";
    }
}

class StackOverFlowException extends Exception
{
    @Override
    public String toString()
    {
        return "Stack is Full";
    }
}

class Stack
{
    private int size;

    private int arr[] ;

    private int top = -1;

    public void setSize(int size)
    {
        this.size = size;
        arr = new int[size];
    }

    public void push(int x) throws StackOverFlowException
    {
        if(top == size - 1)
            throw new StackOverFlowException();

        arr[++top] = x;
    }

    public int pop() throws StackUnderFlowException
    {
        if(arr[top] == -1)
            throw new StackUnderFlowException();

        return arr[top--];
    }
}

public class Main {

    public static void main(String[] args) throws Exception
    {
        Stack s = new Stack();
        s.setSize(5);
        try
        {
            s.push(4);
            s.push(6);
            s.push(7);
            s.push(2);
            s.push(9);
            s.push(3);
        }
        catch (StackOverFlowException e)
        {
            System.out.println(e);
        }
    }
}
