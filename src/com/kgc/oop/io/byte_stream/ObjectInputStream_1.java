package com.kgc.oop.io.byte_stream;

import java.io.*;

/**
 * @author：杨涛
 * fis = new FileInputStream(new File("D:\\Demo\\ObjectInputStream_1.xxx"));
 */
public class ObjectInputStream_1 {

    public static void readUser(FileInputStream fis) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(fis);
        User user = (User) ois.readObject();
        System.out.println(user);
        fis.close();
        ois.close();
    }

    public static void writeUser(User user,FileOutputStream fos) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        oos.writeObject(null);
        oos.flush();
        fos.close();
        oos.close();
        System.out.println("写入完成");
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(new File("D:\\Demo\\ObjectInputStream_2.xxx"));
//      User zhangsan = new User("张三",20,false,5000);
        User lisi = new User("李四",21,true,6000);
//      writeUser(zhangsan,fos);
        writeUser(lisi,fos);

        FileInputStream fis = new FileInputStream("D:\\Demo\\ObjectInputStream_2.xxx");
        readUser(fis);

    }

}
