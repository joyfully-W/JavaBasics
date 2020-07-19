package com.joyfully.StringLearn;

import java.util.Scanner;

/*
分割字符串的方法：
public String[] split(String regex)：按照参数的规则，将字符串切分成为若干部分。

注意事项：
split方法的参数其实是一个“正则表达式”，今后学习。
今天要注意：如果按照英文句点“.”进行切分，必须写"\\."（两个反斜杠）
 */
public class SplitString {

	public static void main(String[] args) {
		String str1 = "aaa,bbb,ccc";
//		法一
//		String[] array1 = str1.split(",");
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }
//		法二
		for (String s : str1.split(",")) {
			System.out.println(s);
		}
//		特殊字符要转义
		String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\.");
        System.out.println(array3.length); // 0
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        
        
	}

}
