
//冒泡排序：数组的相邻元素换位置
//java.lang.ArrayIndexOutOfBoundsException: 数组越界报错代码
public class maopaopx {

	public static void main(String[] args) {

		int [] arr={1,8,9,6,3,-5,2};
		//调用冒泡排序方法
		bubbleSort(arr);
		//循环输出
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+",");
		}
	}
	
	public static void bubbleSort(int [] arr) {
		for(int i =0;i<arr.length-1;i++){
			for(int j= 0;j<arr.length-i-1;j++){
				if(arr[j] > arr[j+1])
				{
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
