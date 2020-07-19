package com.joyfully.ExtendLearn;
/*
在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：

直接通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找。
间接通过成员方法访问成员变量：
    该方法属于谁，就优先用谁，没有则向上找。
 */
public class ExtendsField {

	public static void main(String[] args) {
		Fu fu = new Fu(); // 创建父类对象
        System.out.println(fu.numFu); // 只能使用父类的东西，没有任何子类内容
        System.out.println("===========");

        Zi zi = new Zi();

        System.out.println(zi.numFu); // 10
        System.out.println(zi.numZi); // 20
        System.out.println("===========");

        // 等号左边是谁，就优先用谁
        System.out.println(zi.num); // 优先子类，200
//        System.out.println(zi.abc); // 到处都没有，编译报错！
        System.out.println("===========");

        // 这个方法是子类的，优先用子类的，没有再向上找
        zi.methodZi(); // 200
        // 这个方法是在父类当中定义的，
        zi.methodFu(); // 100
        
        /* 成员变量重名：
        局部变量：         直接写成员变量名
        本类的成员变量：    this.成员变量名
        父类的成员变量：    super.成员变量名
         */
        zi.method();
        
        /*  方法重名：
        在父子类的继承关系当中，创建子类对象，访问成员方法的规则：
            创建的对象是谁，就优先用谁，如果没有则向上找。

        注意事项：
        无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的。

        重写（Override）
        概念：在继承关系当中，方法的名称一样，参数列表也一样。

        重写（Override）：方法的名称一样，参数列表【也一样】。覆盖、覆写。
        重载（Overload）：方法的名称一样，参数列表【不一样】。

        方法的覆盖重写特点：创建的是子类对象，则优先用子类方法。
         */
     // 创建的是new了子类对象，所以优先用子类方法
        zi.cmmethod();
        
        

	}

}
