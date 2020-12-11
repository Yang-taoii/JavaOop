package com.kgc.oop.io.file;

import java.io.File;

/**
 * @author：杨涛
 * 文件操作
 *      递归查询  递归删除
 */
public class TestRecursion {

    //递归查询
    public static void getFileList(File file){
        File[] files = file.listFiles();
        //递归终止条件
        if (files!=null && files.length>0){
            for (File f : files){
                getFileList(f);
            }
        }
        String mess = file.isFile() ? "文件" : "目录";
        System.out.println(mess + ":" + file.getName());
    }

    //递归删除
    public static void delete(File file) {
        File[] listFiles = file.listFiles();
        // 递归的终止条件
        if (listFiles != null && listFiles.length > 0) {
            for (File f : listFiles) {
                delete(f);
            }
        }
        boolean delete = file.delete();// 删除真文件
        System.out.println("删除：" + delete);
    }



    public static void main(String[] args) {
        File file = new File("D:\\KuGou");
        TestRecursion.getFileList(file);
    }

}
