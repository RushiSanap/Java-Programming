package com.company;

public class Main {

    public static void main(String[] args) {
        int count  = 0;
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                if(i+j <= 5)
                {
                    System.out.print("  ");
                }
                else{
                    for(int k = 1; k < 2*i; k++)
                    {
                        System.out.print("* ");
                    }
                    break;
                }
            }
            System.out.println("");

        }
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 4; j++)
            {
                while(j <= i)
                {
                    System.out.print("  ");
                    j++;
                }
                for(int k = 1; k < 2*(4-i+1); k++)
                {
                    System.out.print("* ");
                }
                break;
            }
            System.out.println("");
        }


    }
}

