package cn.joyfully.base.genericLearn;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericMain {
	public static void main(String[] args) {
//		泛型类
		GenericClass<String> gc = new GenericClass<String>();
		gc.setName("aaa");
//		泛型方法
		GenericMethod gm = new GenericMethod();
		/*
        调用含有泛型的方法method01
        传递什么类型,泛型就是什么类型
     */
		gm.method01(10);
		gm.method01("abc");
		gm.method01(8.8);
		gm.method01(true);

		gm.method02("静态方法,不建议创建对象使用");

    //静态方法,通过类名.方法名(参数)可以直接使用
		GenericMethod.method02("静态方法");
		GenericMethod.method02(1);
		
//		泛型 接口
		new GenericInterface<String>() {

			@Override
			public void method(String i) {
				System.out.println(i + "匿名内部类 实现泛型接口方法");
				
			}
		}.method("aaa");;
		
		
		/*
	    泛型的通配符:
	        ?:代表任意的数据类型
	    使用方式:
	        不能创建对象使用
	        只能作为方法的参数使用
	 */
		
		 ArrayList<Integer> list01 = new ArrayList<>();
	        list01.add(1);
	        list01.add(2);

	        ArrayList<String> list02 = new ArrayList<>();
	        list02.add("a");
	        list02.add("b");

	        printArray(list01);
	        printArray(list02);

		
		
		
	}
	/*
    定义一个方法,能遍历所有类型的ArrayList集合
    这时候我们不知道ArrayList集合使用什么数据类型,可以泛型的通配符?来接收数据类型
    注意:
        泛型没有继承概念的
 */
	private static void printArray(ArrayList<?> list) {
		//使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            //it.next()方法,取出的元素是Object,可以接收任意的数据类型
            Object o = it.next();
            System.out.println(o);
        }		
	}
}
