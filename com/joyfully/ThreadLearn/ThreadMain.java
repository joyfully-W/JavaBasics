package com.joyfully.ThreadLearn;
/*
创建多线程程序的第一种方式:创建Thread类的子类
java.lang.Thread类:是描述线程的类,我们想要实现多线程程序,就必须继承Thread类

实现步骤:
    1.创建一个Thread类的子类
    2.在Thread类的子类中重写Thread类中的run方法,设置线程任务(开启线程要做什么?)
    3.创建Thread类的子类对象
    4.调用Thread类中的方法start方法,开启新的线程,执行run方法
         void start() 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
         结果是两个线程并发地运行；当前线程（main线程）和另一个线程（创建的新线程,执行其 run 方法）。
         多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
java程序属于抢占式调度,那个线程的优先级高,那个线程优先执行;同一个优先级,随机选择一个执行
*/
public class ThreadMain {
	public static void main(String[] args) {
		demo2();
	}
	private static void demo() {
		ExtendsThread et = new ExtendsThread();
		et.start();
		ExtendsThread et1 = new ExtendsThread();
		et1.start();
		//链式编程
        System.out.println(Thread.currentThread().getName());
	}
	private static void demo1() {
		ExtendsThread1 et1 = new ExtendsThread1();
		et1.setName("aaa");
		et1.start();
	}
	/*
    public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
    毫秒数结束之后,线程继续执行
 */
	private static void demo2() {
		//模拟秒表
        for (int i = 1; i <=60 ; i++) {
            System.out.println(i);

            //使用Thread类的sleep方法让程序睡眠1秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}

}
