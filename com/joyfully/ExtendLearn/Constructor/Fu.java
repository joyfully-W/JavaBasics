package com.joyfully.ExtendLearn.Constructor;

public class Fu {
	
	int num = 10;

    public void method() {
        System.out.println("父类方法");
    }

    public Fu() {
        System.out.println("父类无参构造");
    }

    public Fu(int num) {
        System.out.println("父类有参构造！");
    }

}
