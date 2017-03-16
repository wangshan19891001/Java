package com.test1;

import java.util.Calendar;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,6,0,-1,9};
		
//		Bubble bubble = new Bubble();
//		bubble.sort(arr);
		
		int len = 100000;
		int arr1[] = new int[len];
		for(int i = 0; i < len; i++){
			//让程序随机产生一个 1-10000的数
			// Math.random() 会随机产生一个 0~1 的数
			int t = (int)Math.random()*10000;
			
			arr1[i] = t;
			
		}
		
		
		
		Select select = new Select();
		Calendar cal = Calendar.getInstance();
		System.out.println("排序前"+cal.getTime());
		select.sort(arr1);
		//重新获取单例(这里相当于刷新一下时间)
		cal = Calendar.getInstance();
		System.out.println("排序后"+cal.getTime());
	}

}


//冒泡
class Bubble{
	
	//冒泡排序
	public void sort(int arr[]){
		
		int temp = 0;
		//排序
		//外层循环, 决定一共走几趟
		for(int i = 0; i < arr.length-1; i++){
			//内层循环, 开始逐个比较, 如果发现前一个数比后一个数大, 则交换
			for(int j = 0; j<arr.length-1-i; j++){
				
				if(arr[j] > arr[j+1]){
					
					//交换
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
				
			}
		}
		
	}
	
}


//选择排序
class Select {
	
	//选择排序
	public void sort(int arr[]){
		
		//假设第一个数就是最小的
//		int min = arr[0];
		//记录最小数的下标
//		int minIndex = 0;
		
		int temp = 0;
		for(int j = 0; j < arr.length-1; j++){
			
			int min = arr[j];
			
			int minIndex = j;
			
			for(int k = j+1; k< arr.length; k++){
				
				if(min > arr[k]){
					
					//修改最小
					min = arr[k];
					minIndex = k;
				}
			}
			
			//当退出内层for循环时, 就找到这一趟的最小值
			temp = arr[j];
			arr[j] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
	}
}

//插入式排序
class InsertSort{
	
	//插入排序方法
	public void sort(int arr[]){
		
		//认为第一个元素是有序的, 所以从1开始
		for(int i = 1; i < arr.length; i++){
			
			//将要被插入的数
			int insertVal = arr[i];
			//insertVal准备和前一个数比较
			int index = i-1;
			while(index >= 0 && insertVal < arr[index]){
				
				//将把arr[index] 向后移动
				arr[index+1] = arr[index];
				index--;
				
			}
			
			//将insertVal 插入到适当位置
			arr[index+1] = insertVal;
			
		}
		
	}
	
}




