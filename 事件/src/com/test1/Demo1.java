package com.test1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Demo1 extends JFrame implements ActionListener{ //实现接口
	
	MyPanel mp = null;
	JButton jb1 = null;
	JButton jb2 = null;
	
	
	public static void main(String[] args) {
		
		Demo1 demo1 = new Demo1();

	}
	
	public Demo1 (){
		
		mp = new MyPanel();
		jb1 = new JButton("黑色");
		
		//注册监听
		jb1.addActionListener(this); //注册监听者
		//指定action命令, 用来区分是哪个按钮点击触发的事件
		jb1.setActionCommand("aa");;
		
		
		
		jb2 = new JButton("红色");
		jb2.addActionListener(this);
		jb2.setActionCommand("bb");
		
		this.add(jb1, BorderLayout.NORTH);
		mp.setBackground(Color.black);
		this.add(mp, BorderLayout.CENTER);
		this.add(jb2, BorderLayout.SOUTH);
		
		Cat cat = new Cat();
		jb1.addActionListener(cat);
		jb2.addActionListener(cat);
		
		
		
		this.setSize(200, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	//对事件处理的方法
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("ok");
		
		//判断是哪个按钮被点击
		if (e.getActionCommand().equals("bb")) {
			System.out.println("点击了红色按钮");
			mp.setBackground(Color.red);
			
			
		}else if(e.getActionCommand().equals("aa")){
			
			System.out.println("点击了黑色按钮");
			mp.setBackground(Color.black);
		}
		
		
	}
	
	
	

}

class Cat implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//判断是哪个按钮被点击
		if (e.getActionCommand().equals("bb")) {
			System.out.println("猫猫知道点击了红色按钮");
			
			
			
		}else if(e.getActionCommand().equals("aa")){
			
			System.out.println("猫猫知道点击了黑色按钮");
				
		}
	}
	
}



class MyPanel extends JPanel {
	
	//
	public void paint(Graphics g){
		super.paint(g);
		
		
	}
	
	
}

