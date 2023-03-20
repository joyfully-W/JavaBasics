package cn.joyfully.base.arraysLearn;

import java.util.Arrays;

public class ArraysMain {

    /**
     * java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。
     * <p>
     * public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1, 元素2, 元素3...]）
     * public static void sort(数组)：按照默认升序（从小到大）对数组的元素进行排序。
     * <p>
     * 备注：
     * 1. 如果是数值，sort默认按照升序从小到大
     * 2. 如果是字符串，sort默认按照字母升序
     * 3. 如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。
     * <p>
     * java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。
     * Math 了解
     * public static double abs(double num)：获取绝对值。有多种重载。
     * public static double ceil(double num)：向上取整。
     * public static double floor(double num)：向下取整。
     * public static long round(double num)：四舍五入。
     * <p>
     * Math.PI代表近似的圆周率常量（double）。
     */
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        // 将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr); // [10, 20, 30]

        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1)); // [1, 2, 3, 6, 10]

        String[] array2 = {"bbb", "aaa", "ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2)); // [aaa, bbb, ccc]


        String str = "asv76agfqwdfvasdfvjh";

        // 如何进行升序排列：sort
        // 必须是一个数组，才能用Arrays.sort方法
        // String --> 数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // 对字符数组进行升序排列
        System.out.println(chars);
        // 需要倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

    }
}
