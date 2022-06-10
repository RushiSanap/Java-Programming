package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\StoreAndRetriveObject\\Float.txt");
            DataInputStream dis = new DataInputStream(fis);

            int x = dis.readInt();
            for(int i = 0; i < x; i++)
                System.out.println(dis.readFloat());

            fis.close();
            fis.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
