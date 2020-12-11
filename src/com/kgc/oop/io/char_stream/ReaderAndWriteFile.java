package com.kgc.oop.io.char_stream;

import java.io.*;

/**
 * @author：杨涛
 */
public class ReaderAndWriteFile {

    public static void reader() throws IOException {
        File file=new File("C:\\Users\\yangtao\\Desktop\\多线程与高并发.txt");
        Reader read=null;
        read=new FileReader(file);
        char[] chs=new char[1024];
        int len=-1;
        while((len=read.read(chs))!=-1) {
            System.out.println(new String(chs,0,len));
        }
        System.out.println("文件读取完成！");
        read.close();
    }

    public static void writer() throws IOException {
        File file=new File("D:\\Demo\\多线程与高并发.txt");
        Writer w = new FileWriter(file,true);
        w.write("finalize的原理其实很简单，在这里简要的梳理一下：\n" +
                "（1）对象在初始化的过程中会判断是否重写了finalize，方法是判断两个字段标志has_finalizer_flag和RegisterFinalizersAtInit。\n" +
                "（2）如果重写了finalize，那就把当前对象注册到FinalizerThread的ReferenceQueue队列中。注册之后的对象就叫做Finalizer。方法是调用register_finalizer函数。此时java虚拟机一看当前有这个对象的引用，于是就不进行垃圾回收了。\n" +
                "（3）对象开始被调用，FinalizerThread线程负责从ReferenceQueue队列中获取Finalizer对象。开始执行finalize方法，在执行之前，这个对象一直在堆中。\n" +
                "（4）对象执行完毕之后，将这个Finalizer对象从队列中移除，java虚拟机一看对象没有引用了，就进行垃圾回收了。\n" +
                "这就是整个过程。不过在这里我们主要看的是finalize方法对垃圾回收的影响，其实就是在第三步，也就是这个对象含有finalize，进入了队列但一直没有被调用的这段时间，会一直占用内存。");
        System.out.println("写入完成");
        w.flush();
        w.close();
    }

    public static void main(String[] args) throws IOException {
        writer();
        //reader();
    }

}
