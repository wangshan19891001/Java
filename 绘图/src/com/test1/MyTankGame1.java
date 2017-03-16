package com.test1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.EventListener;

public class MyTankGame1 extends JFrame{

	MyPanel mp = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTankGame1 mtg = new MyTankGame1();
		
	}
	
	//构造函数
	public MyTankGame1(){
		mp = new MyPanel();
		
		this.add(mp);
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

//我的面板
class MyPanel extends JPanel {
	
	//定义一个 我的坦克
	Hero hero = null;
	
	//构造函数
	public MyPanel(){
		
		hero = new Hero(10,10);
		
	}
	
	//重写paint
	public void paint(Graphics g){
		super.paint(g);
		
		//默认色是黑色, 用黑色填充
		g.fillRect(0, 0, 400, 300);
		
		this.drawTank(hero.getX(), hero.getY(), g, 0, 0);
	}
	
	//画出坦克的函数
	public void drawTank(int x, int y, Graphics g, int direct, int type){
		
		switch(type)
		{
		case 0:
			g.setColor(Color.cyan);
			break;
		case 1:
			g.setColor(Color.yellow);
			break;
		}
		
		//判断方向
		switch(direct){
		
		case 0://向上
			//g.setColor(Color.CYAN);
			 //画出我的坦克
			 //1, 画出左边的矩形
			 g.fill3DRect(x, y, 5, 30, false);
			 //2, 画出右边的矩形
			 g.fill3DRect(x+15, y, 5, 30, false);
			 //3, 画出中间矩形
			 g.fill3DRect(x+5, y+5, 10, 20, false);
			 //4, 画出圆形
			 g.fillOval(x+5, y+10, 10, 10);
			 //5, 画出线
			 g.drawLine(x+10, y+15, x+10, y);
			
			 break;
		}
	}
	
	
	
	
}


//坦克
class Tank {
	
	//表示坦克的x轴
	int x = 0;
	//坦克的y轴
	int y = 0;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	public Tank(int x, int y){
		
		this.x = x;
		this.y = y;
	}
}

//我的坦克
class Hero extends Tank{
	
	public Hero(int x, int y){
		super(x,y); //父类的构造函数
	}
}



