package com.kgc.oop.io.byte_stream;

import java.io.*;

/**
 * @author：杨涛
 */
public class DateInputStream_1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos  = null;

        DataInputStream dis = null;
        DataOutputStream dos = null;

        try {
            fis =new FileInputStream("D:\\picture.jpg");
            System.out.println("可读取到的字节数："+fis.available());
            dis = new DataInputStream(fis);

            byte[] bytes = dis.readAllBytes();
            System.out.println("读取完成");

            fos = new FileOutputStream("C:\\Users\\yangtao\\Desktop\\1.jpg");
            dos = new DataOutputStream(fos);
            dos.write(bytes);
            dos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert dos != null;
                dos.close();
                fos.close();
                dis.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
