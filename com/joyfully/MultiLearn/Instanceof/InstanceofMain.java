package com.joyfully.MultiLearn.Instanceof;

import java.util.ArrayList;
import java.util.List;

/*
如何才能知道一个父类引用的对象，本来是什么子类？
格式：
对象 instanceof 类名称
这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。
 */
public class InstanceofMain {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list instanceof ArrayList); //true
	}
}
