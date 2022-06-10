package com.company;

import javax.print.attribute.IntegerSyntax;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        String data = "Name=Rushikesh;Nationality=India;Age=21;District=Nashik";

        StringTokenizer stk = new StringTokenizer(data,"=;");

        /*while(stk.hasMoreElements())
        {
            System.out.println(stk.nextElement());
        }
        */



        //taking the token from the file
        FileInputStream fis = new FileInputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\CollectionFrameworks\\StringTokenizerDemo\\Student.txt");

        byte b[] = new byte[fis.available()];
        fis.read(b);

        String s = new String(b);

        StringTokenizer st = new StringTokenizer(s, "=");

        while (st.hasMoreElements())
        {
            System.out.println(st.nextElement());
        }



        FileInputStream fis2 = new FileInputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\CollectionFrameworks\\StringTokenizerDemo\\data.txt");

        byte bt[] = new byte[fis2.available()];

        fis2.read(bt);

        String str = new String(bt);

        StringTokenizer stks = new StringTokenizer(str, ",");

        ArrayList<Integer> al = new ArrayList<>();

        while(stks.hasMoreElements())
        {
            al.add(Integer.parseInt(stks.nextToken()));
        }
        System.out.println(al);

    }
}
