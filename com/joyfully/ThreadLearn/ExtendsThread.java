package com.joyfully.ThreadLearn;
/*
获取线程的名称:
    1.使用Thread类中的方法getName()
        String getName() 返回该线程的名称。
    2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
        static Thread currentThread() 返回对当前正在执行的线程对象的引用。
*/
//1.创建一个Thread类的子类
public class ExtendsThread  extends Thread{
	//2.在Thread类的子类中重写Thread类中的run方法,设置线程任务(开启线程要做什么?)
		@Override
		public void run() {
			//获取线程名称
			System.out.println(getName());
			
			//获取线程名称方式二
			System.out.println(Thread.currentThread().getName());
			
			//获取当前运行线程
			System.out.println(Thread.currentThread());
			
		}

}
