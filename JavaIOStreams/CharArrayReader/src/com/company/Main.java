package com.company;

import java.io.CharArrayReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try{
            char c[] = {'a', 'b', 'c', 'd', 'e' ,'f', 'g', 'h', 'i'};
            CharArrayReader car = new CharArrayReader(c);
            int x;
            while((x = car.read()) != -1)
            {
                System.out.print((char)x);
            }
            car.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
