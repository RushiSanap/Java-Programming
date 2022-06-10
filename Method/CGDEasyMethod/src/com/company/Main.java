package com.company;

public class Main {
    int GCD(int x, int y)
    {
        int num1 = x,num2 = y;
        while(num1!=num2)
        {
            if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return num1;
    }

    public static void main(String[] args) {
        Main output = new Main();
        int x = 5, y = 7;
        System.out.println(output.GCD(x,y));
    }
}
