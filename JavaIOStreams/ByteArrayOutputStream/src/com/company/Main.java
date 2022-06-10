package com.company;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
            bos.write('a');
            bos.write('b');
            bos.write('c');
            bos.write('d');
            byte b[] = bos.toByteArray();
            for(Byte bt:b)
                System.out.println(bt);
            bos.writeTo(new FileOutputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\ByteArrayOutputStream\\Test.txt"));
            bos.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
