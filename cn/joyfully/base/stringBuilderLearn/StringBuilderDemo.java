package cn.joyfully.base.stringBuilderLearn;

public class StringBuilderDemo {

    /*
    java.lang.StringBuilder类:字符串缓冲区,可以提高字符串的效率
    构造方法:
        StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
        StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。

    StringBuilder的常用方法:
        public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。

    StringBuilder和String可以相互转换:
        String->StringBuilder:可以使用StringBuilder的构造方法
            StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
        StringBuilder->String:可以使用StringBuilder中的toString方法
            public String toString()：将当前StringBuilder对象转换为String对象。
    */

    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }

    private static void demo3() {
        //String->StringBuilder
        String str = "hello";
        System.out.println("str:" + str);
        StringBuilder bu = new StringBuilder(str);
        //往StringBuilder中添加数据
        bu.append("world");
        System.out.println("bu:" + bu);

        //StringBuilder->String
        String s = bu.toString();
        System.out.println("s:" + s);
    }

    private static void demo2() {
        //创建StringBuilder对象
        StringBuilder bu = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this,调用方法的对象bu,this==bu
        //StringBuilder bu2 = bu.append("abc");//把bu的地址赋值给了bu2
        //System.out.println(bu);//"abc"
        //System.out.println(bu2);//"abc"
        //System.out.println(bu==bu2);//比较的是地址 true

        //使用append方法无需接收返回值
        //  bu.append("abc");
        //  bu.append(1);
        //  bu.append(true);
        //  bu.append(8.8);
        //  bu.append('中');
        //  System.out.println(bu);//abc1true8.8中

        /*
            链式编程:方法返回值是一个对象,可以继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        bu.append("abc").append(1).append(true).append(8.8).append("中");
        System.out.println(bu);//abc1true8.8中
    }

    private static void demo1() {
        //空参数构造方法
        StringBuilder kcBuilder = new StringBuilder();
        System.out.println("kcBuilder:" + kcBuilder);//kcBuilder:""

        //带字符串的构造方法
        StringBuilder ycBuilder = new StringBuilder("abc");
        System.out.println("ycBuilder:" + ycBuilder);//ycBuilder:abc
    }

}

