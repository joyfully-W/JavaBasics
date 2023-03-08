package cn.joyfully.base.AbstractLearn;

public class AbstractMain {
    public static void main(String[] args) {

        //错误写法！不能直接创建抽象类对象
        //Animal animal = new Animal();

        Cat cat = new Cat();
        cat.eat();
    }
}
