//选择排序：数组的每个元素都要进行比较

public class selectSort {

	public static void main(String[] args) {
		int [] arr = {0,5,2,4,3,1};
		
		//调用数组排序方法
		selects(arr);
		//循环输出
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]);
		}

	}
	//数组选择排序
	public static void  selects(int [] arr) {
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				//判断
				if(arr[i]>arr[j]){
					//换位置
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
