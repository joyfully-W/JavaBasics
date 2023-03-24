package cn.joyfully.base.collectionsLearn;

import java.util.ArrayList;
import java.util.Collections;

public class Collections1 {
    /*
        - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
            - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
            - public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。

        */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加多个元素
        /*list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");*/

        //public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        Collections.addAll(list, "a", "b", "c", "d", "e");

        System.out.println(list);//[a, b, c, d, e]

        //public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
        Collections.shuffle(list);
        System.out.println(list);//[b, d, c, a, e], [b, d, c, a, e]


    /*
     *  public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

        注意:
             sort(List<T> list)使用前提
             被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

        Comparable接口的排序规则:
            自己(this)-参数:升序
            参数-自己(this):降序
     */

        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);//[1, 3, 2]

        //public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
        Collections.sort(list01);//默认是升序

        System.out.println(list01);//[1, 2, 3]

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        System.out.println(list02);//[a, c, b]

        Collections.sort(list02);
        System.out.println(list02);//[a, b, c]

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张三", 18));
        list03.add(new Person("李四", 20));
        list03.add(new Person("王五", 15));
        System.out.println(list03);//[Person{name='张三', age=18}, Person{name='李四', age=20}, Person{name='王五', age=15}]

        Collections.sort(list03);
        System.out.println(list03);
    }
}


