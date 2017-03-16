package com.test1;

import java.awt.*;
import javax.swing.*;

public class Demo1 extends JFrame {

	MyPanel1 mp = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 demo1 = new Demo1();

	}

	public Demo1() {

		mp = new MyPanel1();

		this.add(mp);

		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

}

// 定义一个MyPanel 面板, 用于绘图 和 实现绘图的区域
class MyPanel1 extends JPanel {

	// 重写Jpanel 的 paint 方法
	// Graphics 是绘图的重要类, 你可以把它理解成一只画笔
	public void paint(Graphics g) {

		System.out.println("paint 被调用");

		// 1, 调用父类函数完成初始化.
		super.paint(g);
		// 画一个圆
//		g.setColor(Color.red);
//		g.drawOval(10, 10, 30, 30);
//		g.setColor(Color.blue);
//		g.fillOval(100, 100, 30, 30);
		
		//画出图片
//		Image im = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/taiyang.jpg"));
//		g.drawImage(im, 90, 90, 320, 400, this);
		
		
		
		//画出文字
		g.setColor(Color.red);
		g.setFont(new Font("华文彩云", Font.BOLD, 50));
		g.drawString("祖国", 100, 100);
		
		
		
		
	}

}
