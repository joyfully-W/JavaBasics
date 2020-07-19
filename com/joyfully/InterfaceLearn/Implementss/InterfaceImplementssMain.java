package com.joyfully.InterfaceLearn.Implementss;
/*
使用接口的时候，需要注意：

1. 接口是没有静态代码块或者构造方法的。
2. 一个类的直接父类是唯一的，但是一个类可以同时实现多个接口。
格式：
public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
    // 覆盖重写所有抽象方法
}
3. 如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可。
4. 如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么实现类就必须是一个抽象类。
5. 如果实现类锁实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写。
6. 一个类如果直接父类当中的方法，和接口当中的默认方法产生了冲突，优先用父类当中的方法。
 */

/*
1. 类与类之间是单继承的。直接父类只有一个。
2. 类与接口之间是多实现的。一个类可以实现多个接口。
3. 接口与接口之间是多继承的。

注意事项：
1. 多个父接口当中的抽象方法如果重复，没关系。
2. 多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写，【而且带着default关键字】。
 */
public class InterfaceImplementssMain {

	public static void main(String[] args) {
		// 继承要优先接口实现的
		Zi zi = new Zi();
		zi.method();
	}

}
