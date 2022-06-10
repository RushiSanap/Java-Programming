package com.company;

public class Main {

    //max element using variable arguments
    static int max(int ...A)
    {
        if(A.length == 0)
            return Integer.MIN_VALUE;

        int max = A[0];
        for(int x:A)
        {
            if(x>max)
                max = x;
        }
        return max;
    }

    //sum of all elements using variable arguments
    static int sum(int ...A)
    {
        int sum = 0;
        for(int x:A)
            sum = sum + x;
        return sum;
    }

    static double discount(double ...price)
    {
        double sum = 0;
        for(double x:price)
            sum = sum + x;
        if(sum < 500)
            return 0.1*sum;

        else if(sum >= 500 && sum < 1000)
            return 0.15*sum;

        else
            return 0.2*sum;
    }

    public static void main(String[] args) {
        double x = discount(90,40,500,100,200);
        System.out.println(x);

    }
}
