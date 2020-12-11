package com.kgc.oop.io.char_stream;

import java.io.*;


/**
 * @author：杨涛
 *     BufferedReader 和 BufferedWriter
 */
public class Buffered {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\yangtao\\Desktop\\多线程与高并发.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("D:\\Demo\\多线程与高并发copy.txt");
        BufferedWriter bw = new BufferedWriter(fileWriter);
        String line = null;
        while ((line = br.readLine())!=null){
            bw.write(line+"\n");
        }
        bw.flush();
        System.out.println("复制完成！");
        bw.close();
        fileWriter.close();
        fileReader.close();
        br.close();
    }
}
