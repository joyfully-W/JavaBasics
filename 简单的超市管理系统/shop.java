package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class shop {

	public static void main(String[] args) {
		//创建集合，存储商品类型
		ArrayList<Fitem> array = new ArrayList<Fitem>();
		//调用商品初始化
		init(array);
		while (true) {
			//调用菜单方法
			mainMenu();
			//调用用户选择方法
			int choose =choose();
			switch (choose) {
			case 1:
				//调用查看商品;
				showf(array);
				break;
			case 2:
				//调用添加商品;
				inputf(array);
				break;
			case 3:
				//调用删除商品;
				dele(array);
				break;
			case 4:
				//调用修改商品;
				alterf(array);
				break;
			case 5:
				//调用退出系统;
				return;

			default:
				System.out.println("功能不存在");
				break;
			}
			
		}
		
	}
	//商品的修改功能
	public static void alterf(ArrayList<Fitem> array) {
		System.out.println("欢迎使用修改功能");
		System.out.println("请输入产品编号");
		Scanner sc = new Scanner(System.in);
		int id= sc.nextInt();
		//遍历
		for (int i = 0; i < array.size(); i++) {
			Fitem f= array.get(i);
			if (f.ID==id) {
				System.out.println("请输入商品编号");
				f.ID=sc.nextInt();
				System.out.println("请输入新的商品名称");
				f.name=sc.next();
				System.out.println("请输入新的商品价格");
				f.price=sc.nextDouble();
				System.out.println("商品修改成功");
				return ;
			}
		}
		System.out.println("输入编号不存在");
	}
	
	//删除商品功能
	public static void dele(ArrayList<Fitem> array) {
		System.out.println("欢迎使用删除功能");
		System.out.println("请输入要删除商品的编号");
		Scanner sc =new Scanner(System.in);
		int id = sc.nextInt();
		//遍历集合
		for (int i = 0; i < array.size(); i++) {
			//获取每个fitem的变量
			Fitem f = array.get(i);
			//判断
			if(f.ID==id){
				//移除集合的元素  使用集合的方法 remove()实现；
				array.remove(i);
				System.out.println("删除成功");
				//结束方法
				return ;
			}
		}
		System.out.println("无该商品编号");
	}
	
	
	//添加商品功能：
	public static void inputf(ArrayList<Fitem> array) {
		System.out.println("欢迎使用商品添加功能");
		//创建变量
		Scanner sc= new Scanner(System.in);
		System.out.println("输入产品编号");
		int id =sc.nextInt();
		System.out.println("请输入商品名称");
		String name =sc.next();
		System.out.println("请输入商品价格");
		double price =sc.nextDouble();
		//创建新对象
		Fitem f=new Fitem();
		//赋值
		f.ID=id;
		f.name=name;
		f.price=price;
		//加载进集合
		array.add(f);
	}
	
	//货物清单的功能：遍历集合
	public static void showf(ArrayList<Fitem> array) {
		System.out.println("*********商品列表*********");
		System.out.println("商品编号    商品名称    商品单价");
		for (int i = 0; i < array.size(); i++) {
			//集合的get方法 获取变量
			Fitem fitem =array.get(i);
			//打印输出
			System.out.println(fitem.ID+"      "+fitem.name+"      "+fitem.price);
		}
	}
	
	//定义方法，实现用户的键盘输入
	public static int  choose() {
		Scanner sc= new Scanner(System.in);
		return sc.nextInt();
	}
	
	//定义方法是，实现主菜单
		public static void mainMenu() {
			System.out.println("商店管理系统");
			System.out.println("1.查看商品 2.添加商品 3.删除商品 4.修改商品  5.退出系统");
			System.out.println("请你输入要操作的功能序号");
		}
	
	
	//定义方法，实现商品数据的初始化
		public static void init(ArrayList<Fitem> array) {
			Fitem f1	= new Fitem();
			f1.ID=0001;
			f1.name="苹果";
			f1.price=12.7;
			
			Fitem f2	= new Fitem();
			f2.ID=0002;
			f2.name="香蕉";
			f2.price=16.7;
			
			Fitem f3	= new Fitem();
			f3.ID=0003;
			f3.name="雪梨";
			f3.price=15.8;
			
			//保存在集合中
			array.add(f1);
			array.add(f2);
			array.add(f3);
				
			}

}
