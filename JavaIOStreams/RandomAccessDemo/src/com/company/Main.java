package com.company;

import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class Main {

    public static void main(String[] args)throws Exception {
        /*ABCDEFGHIJK
        file content at the beginning
         */
        RandomAccessFile raf = new RandomAccessFile("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\RandomAccessDemo\\Test.txt","rw");
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());

        raf.write('d');

        System.out.println((char)raf.read());
        System.out.println((char)raf.read());

        raf.skipBytes(3);

        System.out.println((char)raf.read());
        System.out.println((char)raf.read());

        raf.seek(3);
        System.out.println((char)raf.read());

        long filePosition = raf.getFilePointer();
        System.out.println(filePosition);

        raf.close();

    }
}
