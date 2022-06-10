package com.company;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try
        {
            float list[] = {2.4f, 5.6f,2.9f,6.7f};

            FileOutputStream fos = new FileOutputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\StoreAndRetriveObject\\Float.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            int x = list.length;
            dos.writeInt(x);
            for(int i = 0; i < x ; i++)
                dos.writeFloat(list[i]);

            fos.close();
            dos.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
