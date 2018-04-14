

public class demoerf {

	public static void main(String[] args) {
		
		int [] arr={2,4,5,8,9,10,12,16,19};
		//调用二分查找法
	 int index =erfenfa(arr,5);
		System.out.println(index);
		

	}
	//三个变量 min mid max
	//折半条件 min <= max
	//元素 > 中间索引 小指针 = 中间+1
	//元素 < 中间索引  大指针 = 中间-1
	//元素 == 中间索引  找到元素，结束循环
	public static int erfenfa(int [] arr,int key) {
		int min=0;
		int max=arr.length-1;
		int mid =0;
		while(min<=max){
			//计算中间索引
			mid = (min+max)/2;
			//和中间索引进行比较
			if(key>arr[mid]){
				min=mid+1;
			}else if (key<arr[mid]) {
				max =mid-1;
			}else {
				//找到元素
				return mid;
			}
		}
		return -1;
		
	}

}
