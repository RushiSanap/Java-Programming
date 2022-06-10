package com.company;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try
        {
            byte b[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};

            ByteArrayInputStream bis = new ByteArrayInputStream(b);
            int x;
            while ((x = bis.read()) != -1)
                System.out.print((char)x);
            bis.close();

            //alternative method
            byte t[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};

            ByteArrayInputStream bis2 = new ByteArrayInputStream(t);
            String str = new String(bis2.readAllBytes());
            System.out.println("\n" + str);
            System.out.println(bis2.markSupported());
            bis2.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}
