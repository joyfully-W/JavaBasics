package com.test;

import java.util.Scanner;

public class demosxh {
	public static void main(String[] args){
		System.out.println("请输入一个数字1-9，打印乘法表");
		Scanner scanner= new Scanner(System.in);
		int n =scanner.nextInt();
		
		print99(n);
		
	}
	
	public static void print99(int n) {
		//循环
			for(int i=1;i<=n;i++){
				for(int j=1;j<=i;j++){
					System.out.print(j+"*"+i+"="+i*j+"  ");
					}
				//换行
				System.out.println();
				}
	}
}
