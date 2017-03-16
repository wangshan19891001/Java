package com.test1;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float arr[] = new float [6];
		arr[0] = 3;
		arr[1] = 5;
		arr[2] = 1;
		arr[3] = 3.4f;
		arr[4] = 2;
		arr[5] = 50;
		
		
		float all = 0f;
		for(int i = 0; i< 6; i++){
			all += arr[i];
		}
		
		System.out.println("总体重"+all);
		
		
	}

}
