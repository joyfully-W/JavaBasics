package com.joyfully.ExtendLearn;

public class Zi extends Fu {

    int numZi = 20;

    int num = 200;

    public void methodZi() {
        // 因为本类当中有num，所以这里用的是本类的num
        System.out.println(num);
    }
    
    public void method() {
        int num = 300;
        System.out.println(num); // 300，局部变量
        System.out.println(this.num); // 200，本类的成员变量
        System.out.println(super.num); // 100，父类的成员变量
    }
    
    public void cmmethod() {
        System.out.println("子类重名方法执行！");
    }

}
