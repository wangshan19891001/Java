package com.test2;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Demo1 extends JFrame {
	
	MyPanel mp = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 demo1 = new Demo1();
	}
	
	public Demo1(){
		
		mp = new MyPanel();
		
		this.add(mp);
		
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		this.addKeyListener(mp);
		
		
	}
	

}


class MyPanel extends JPanel implements KeyListener{
	
	int x = 10;
	int y = 10;
	
	public void paint(Graphics g){
		super.paint(g);
		
		g.fillOval(x, y, 10, 10);
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(e.getKeyChar());
		
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			y--;
			break;
		case KeyEvent.VK_DOWN:
			y++;	
			break;
		case KeyEvent.VK_LEFT:
			x--;
			break;
		case KeyEvent.VK_RIGHT:
			x++;
			break;
		default:
			break;
		}
		
		//调用repaint() 函数, 重绘页面
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}



