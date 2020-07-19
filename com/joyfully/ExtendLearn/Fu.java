package com.joyfully.ExtendLearn;

public class Fu {

    int numFu = 10;

    int num = 100;

    public void methodFu() {
        // 使用的是本类当中的，不会向下找子类的
        System.out.println(num);
    }
    
    public void cmmethod() {
        System.out.println("父类重名方法执行！");
    }

}
