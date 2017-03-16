/**
 * 流式布局案例
 */
package com.test4;

import java.awt.*;
import javax.swing.*;

public class Demo2 extends JFrame{
	
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo2 demo2 = new Demo2();
		
	}
	
	// 二, FlowLayout
	/*
		流式布局 FlowLayout 按照组件的添加次序将按钮组件从左到右放置在容器中
		1, 不限制它所管理的组件大小, 允许他们有最佳大小
		2, 当容器被缩放时, 组件的位置可能变化, 但组件的大小不变
		3, 组件默认是居中对齐的
	*/
	
	
	public Demo2(){
		
		jb1 = new JButton("关羽");
		jb2 = new JButton("张飞");
		jb3 = new JButton("赵云");
		jb4 = new JButton("马超");
		jb5 = new JButton("黄忠");
		jb6 = new JButton("魏延");
		
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		//设置布局管理器
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		this.setTitle("流式布局");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
		
	}
	
	

}
