package com.company;

public class Main {
    static  int GCD(int x, int y)
    {
        int count1 = 0, count2 = 0;
        int index = 0;
        int A[] = new int[20];
        int B[] = new int[20];
        for(int i = 1; i <=x; i++)
        {
            if(x%i == 0)
            {
                A[count1++] = i;
            }
        }
        for(int i = 1; i <=y; i++)
        {
            if(y%i == 0)
            {
                B[count2++] = i;
            }
        }

        int flag = 0;
        if(x == y)
            return x;

        if(x < y)
        {
            for(int i = count1 - 1; i >= 0; i--)
            {
                for(int j = count2 - 1; j >= 0; j--)
                {
                    if(A[i] == B[j])
                    {
                        index = i;
                        flag = 1;
                        break;
                    }
                }
                if(flag == 1)
                    break;
            }
        }
        else
        {
            for(int i = count2 - 1; i >= 0; i--)
            {
                for(int j = count1 - 1; j >= 0; j--)
                {
                    if(B[i] == A[j])
                    {
                        index = j;
                        flag = 1;
                        break;
                    }
                }
                if(flag == 1)
                    break;
            }
        }
        return A[index];
    }


    public static void main(String[] args) {
        int x = 20, y = 20;
        System.out.println(GCD(x,y));

    }
}
