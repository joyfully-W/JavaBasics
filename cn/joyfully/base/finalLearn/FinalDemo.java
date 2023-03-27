package cn.joyfully.base.finalLearn;

public class FinalDemo {
    /*
        final关键字代表最终、不可改变的。

        常见四种用法：
        1. 可以用来修饰一个类
        2. 可以用来修饰一个方法
        3. 还可以用来修饰一个局部变量
        4. 还可以用来修饰一个成员变量


        当final关键字用来修饰一个类的时候，格式：
        public final class 类名称 {
            // ...
        }

        含义：当前这个类不能有任何的子类。（太监类）
        注意：一个类如果是final的，那么其中所有的成员方法都无法进行覆盖重写（因为没儿子。）

        当final关键字用来修饰一个方法的时候，这个方法就是最终方法，也就是不能被覆盖重写。
        格式：
        修饰符 final 返回值类型 方法名称(参数列表) {
            // 方法体
        }

        注意事项：
        对于类、方法来说，abstract关键字和final关键字不能同时使用，因为矛盾。

        Java中有四种权限修饰符：
                              public  >   protected   >   (default)   >   private
        同一个类（我自己）        YES           YES             YES             YES
        同一个包（我邻居）        YES           YES             YES             NO
        不同包子类（我儿子）       YES           YES             NO              NO
        不同包非子类（陌生人）      YES           NO              NO              NO

        注意事项：(default)并不是关键字“default”，而是根本不写。
    */
    public static void main(String[] args) {
        // 一旦使用final用来修饰局部变量，那么这个变量就不能进行更改。
        // “一次赋值，终生不变”
        final int num2 = 200;
        System.out.println(num2); // 200

        // 正确写法！只要保证有唯一一次赋值即可
        final int num3;
        num3 = 30;

        // 对于基本类型来说，不可变说的是变量当中的数据不可改变
        // 对于引用类型来说，不可变说的是变量当中的地址值不可改变
        Student stu1 = new Student("赵丽颖", 20);
        System.out.println(stu1);
        System.out.println(stu1.getName()); // 赵丽颖
        stu1 = new Student("霍建华", 22);
        System.out.println(stu1);
        System.out.println(stu1.getName()); // 霍建华
        System.out.println("===============");

        final Student stu2 = new Student("高圆圆", 24);
        // 错误写法！final的引用类型变量，其中的地址不可改变
        // stu2 = new Student("赵又廷");
        //可以修改内容
        System.out.println(stu2.getName()); // 高圆圆
        stu2.setName("高圆圆圆圆圆圆");
        System.out.println(stu2.getName()); // 高圆圆圆圆圆圆
    }

}
