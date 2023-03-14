package cn.joyfully.demo.daffodil;

/**
 * 水仙花数
 */
public class Sxhdemo {
    public static void main(String[] args) {
        //定义变量
        int bai = 0;
        int shi = 0;
        int ge = 0;
        //循环
        for (int i = 100; i < 1000; i++) {
            //对i进行判断
            //获取百位
            bai = i / 100;
            //获取十位
            shi = i / 10 % 10;
            //获取个位
            ge = i % 10;

            if (bai * bai * bai + shi * shi * shi + ge * ge * ge == i) {
                //输出水仙花数
                System.out.println(i);
            }
        }
    }
}
