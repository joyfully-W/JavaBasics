package com.joyfully.StringLearn;
/*
String当中与转换相关的常用方法有：

public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes()：获得当前字符串底层的字节数组。
public String replace(CharSequence oldString, CharSequence newString)：
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
备注：CharSequence意思就是说可以接受字符串类型。
 */
public class ConvertString {
	public static void main(String[] args) {
		// 转换成为字符数组
		char[] array = "nihao".toCharArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// 转换成为字节数组
		byte[] bytes = "abcde".getBytes();
		for (byte b : bytes) {
			System.out.println(b);
		}
		// 字符串的内容替换
		String replace = "aabbccddaa".replace("a", "e");
		System.out.println(replace);
		
		String lang1 = "会不会玩儿呀！你大爷的！你大爷的！你大爷的！！！";
        String lang2 = lang1.replace("你大爷的", "****");
        System.out.println(lang2); // 会不会玩儿呀！****！****！****！！！
	}
}
