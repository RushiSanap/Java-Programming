package com.company;

public class Main {

    static void show(int ...A)
    {
        for(int x:A)
            System.out.println(x);
    }

    static void showList(String ...S)
    {
        for(int i = 0; i < S.length; i++)
        {
            System.out.println(i + 1 + "." + S[i]);
        }
    }

    static void showList(int start, String ...S)
    {
        for(int i = 0; i < S.length; i++)
        {
            System.out.println(start + "." + S[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        //show();
        //show(10,20,30);
        //System.out.println();
        //show(new int[]{1,2,3,4,5,6,7,8});
        showList(5,"Rushikesh", "Ritesh", "Vikas", "Darshana");
    }
}
