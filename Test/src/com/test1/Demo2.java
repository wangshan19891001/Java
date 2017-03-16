package com.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Demo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//定义一个可以存放四只dog 的对象数组
		Dog dogs[] = new Dog[4];
		
		//给各个dog赋初值
//		dogs[0] = new Dog();
//		dogs[0].setName("花花");
//		dogs[0].setWeight(4.5f);
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		for(int i = 0; i < 4; i++){
			dogs[i] = new Dog();
			System.out.println("请输入狗名:");
			String name = br.readLine(); //程序会等待用户输入
			
			dogs[i].setName(name);
			System.out.println("请输入狗的体重");
			String s_weight = br.readLine();
			float weight = Float.parseFloat(s_weight);   //String ->float
			dogs[i].setWeight(weight);
			
			
		}
		
		//计算平均体重
		float allweight = 0;
		for(int i = 0; i < dogs.length; i++){
			allweight += dogs[i].getWeight();
		}
		float avgWeight = allweight / dogs.length;
		System.out.println("总体重"+allweight + "平均体重"+avgWeight);
		
		//比较字符串内容是否相等时, 应该用equals , 不能用 == 比较字符串
		
		
		//数组小结
		/*
			1, 数组可存放同一类型数据
			2, 基本数据类型, 可以直接赋值
			3, 对象数组定以后, 赋值时, 需要先对每个对象初始化, 分配空间  new 对象
			4, 数组大小必须事先指定(可以用链表解决这个问题)
			5, 数组名可以理解为指向数组首地址的引用
			6, 数组的下标从0 开始
		
		*/
		
	}

}


class Dog {
	
	private String name;
	private float weight;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
}



