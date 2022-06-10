package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try
        {
            FileInputStream fip = new FileInputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\IOStreamDemo\\Test.txt");
            //byte b[] = new byte[fip.available()];
            //fip.read(b);
            //String str = new String(b);
            //System.out.println(str);

            //alternative method
            int x;
            while((x = fip.read()) != -1)
            {
                System.out.print((char)x);
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
