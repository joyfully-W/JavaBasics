package cn.joyfully.demo.arraySequence;

public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        //调用逆序存放函数
        nx(arr);
        //调用遍历函数
        printarr(arr);
    }

    private static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void nx(int[] arr) {
        for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
    }
}
