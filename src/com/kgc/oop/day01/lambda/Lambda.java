package com.kgc.oop.day01.lambda;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 使用 Lambda表达式
 *
 *         // 1. 不需要参数,返回值为 5
 *         () -> 5
 *
 *         // 2. 接收一个参数(数字类型),返回其2倍的值
 *         x -> 2 * x
 *
 *         // 3. 接受2个参数(数字),并返回他们的差值
 *         (x, y) -> x – y
 *
 *         // 4. 接收2个int型整数,返回他们的和
 *         (int x, int y) -> x + y
 *
 *         // 5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)
 *         (String s) -> System.out.print(s)
 */
@FunctionalInterface
interface sort{
    void sortArr(Arrays arrays);
}




public class Lambda {
    public static void main(String[] args) {

        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};

        List<String> players =  Arrays.asList(atp);
        // 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }
        System.out.println();
        System.out.println("**************for循环*******************");
        // 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((player) -> System.out.print(player + "; "));
        System.out.println();
        System.out.println("***************lambda 表达式******************");
        // 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::println);
        System.out.println("***************Java 8 中使用双冒号操作符*****************");



        // 1.1使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world ! --> 1.1");
            }
        }).start();
        // 1.2使用 lambda expression
        new Thread(() -> System.out.println("Hello world ! --> 1.2")).start();



        // 2.1使用内部类 new Runnable接口的同时实现run方法
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world ! --> 2.1");
            }
        };

        // 2.2使用 lambda expression
        Runnable race2 = () -> System.out.println("Hello world ! --> 2.2");

        // 直接调用 run 方法(没开新线程哦!)
        race1.run();
        race2.run();


        /*
         * 使用 Lambdas 排序集合
         */

        // 1.1 使用匿名内部类根据 name 排序 players

        String[] player = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

        // 1.1 使用匿名内部类根据 name 排序 players 使用比较器
        Arrays.sort(player, new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });

        // 1.2 使用 lambda expression 排序 players
        Comparator<String> sortByName = String::compareTo;
        Arrays.sort(player, sortByName); //底层实现 根据用户选择 传统合并排序 或者 TimSort.sort
        System.out.println("排序后1：");
        Arrays.asList(player).forEach(System.out::println);
        System.out.println("排序后2：");
        for (String s : player) {
            System.out.println(s);
        }


    }

}
