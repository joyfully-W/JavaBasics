package cn.joyfully.demo.multiplication;

import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        System.out.println("请输入一个数字1-9，打印乘法表");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print99(n);
    }

    private static void print99(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "  ");
            }
            System.out.println();
        }
    }
}
