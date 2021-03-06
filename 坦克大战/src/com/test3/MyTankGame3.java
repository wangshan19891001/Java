/**
 * 功能: 坦克游戏2.0
 * 1, 画出坦克
 * 2, 我的坦克可以移动
 * 3, 可以发射子弹, 子弹连发
 */
package com.test3;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.Vector;


public class MyTankGame3 extends JFrame{

	MyPanel mp = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTankGame3 mtg = new MyTankGame3();
		
	}
	
	//构造函数
	public MyTankGame3(){
		mp = new MyPanel();
		
		this.add(mp);
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/********	注册监听	*********/
		this.addKeyListener(mp);
		
		//启动mp线程
		Thread t = new Thread(mp);
		t.start();
		
		
	}
	
}

//我的面板
class MyPanel extends JPanel implements KeyListener, Runnable {
	
	//定义一个 我的坦克
	Hero hero = null;
		
	//定义敌人的坦克集合
	Vector<EnemyTank> ets = new Vector<EnemyTank>();
	//敌人坦克的数目
	int etSize = 3;
	
	
	//构造函数
	public MyPanel(){
		
		hero = new Hero(60,100);
		
		for(int i = 0; i < etSize; i++){
			EnemyTank et = new EnemyTank(10+50*i, 10);
			et.setColor(0);
			et.setDirect(2);
			ets.add(et);
		}
		
	}
	
	//重写paint
	public void paint(Graphics g){
		super.paint(g);
		
		//默认色是黑色, 用黑色填充
		g.fillRect(0, 0, 400, 300);
		
		//绘制我的坦克
		this.drawTank(hero.getX(), hero.getY(), g, this.hero.direct, 1);
		
		//从ss中取出每颗子弹,并画出
		for (int i = 0; i < this.hero.ss.size(); i++) {
			
			Shot myShot = hero.ss.get(i);
			
			//画出子弹 (画出一颗子弹)
			//如果子弹不为空, 则画出子弹
			if (myShot != null && myShot.isLive == true) {
				g.draw3DRect(myShot.x, myShot.y, 1, 1, false);
			}
			
			//如果这颗子弹已经销毁, 则从ss中删除
			if (myShot.isLive == false) {
				this.hero.ss.remove(myShot);
			}
			
		}
		
		
		
		
		//绘制敌人的坦克
		for (int i = 0; i < ets.size(); i++) {
			EnemyTank et = ets.get(i);
			if (et.isLive == true) {
				
				this.drawTank(et.getX(), et.getY(), g, et.direct, 0);
			}
		}
		
	}
	
	//子弹击中敌人坦克
	public void hitTank(Shot s, EnemyTank et){
		
		switch (et.direct) {
		
		//方向是上下
		case 0:
			
			
		case 2:
			if (s.x > et.x && s.x < et.x+20 && s.y > et.y && s.y < et.y+30) {
				//击中
				//子弹销毁
				s.isLive = false;
				//敌人坦克销毁
				et.isLive = false;
			}
			
			break;
			
			
		//方向是左右
		case 1:
			
			
		case 3:
			if (s.x > et.x && s.x < et.x+30 && s.y > et.y && s.y < et.y+20) {
				//击中
				//子弹销毁
				s.isLive = false;
				//敌人坦克销毁
				et.isLive = false;
			}
			break;
			
		default:
			break;
		}
		
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
			 
		case 1://向右
			 //画出我的坦克
			 //1, 画出上边的矩形
			 g.fill3DRect(x, y, 30, 5, false);
			 //2, 画出下边的矩形
			 g.fill3DRect(x, y+15, 30, 5, false);
			 //3, 画出中间矩形
			 g.fill3DRect(x+5, y+5, 20, 10, false);
			 //4, 画出圆形
			 g.fillOval(x+10, y+5, 10, 10);
			 //5, 画出线
			 g.drawLine(x+15, y+10, x+30, y+10);
			
			 break;
			 
		case 2://向下
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
			 g.drawLine(x+10, y+15, x+10, y+30);
			
			 break;
			 
		case 3://向左
			//画出我的坦克
			 //1, 画出上边的矩形
			 g.fill3DRect(x, y, 30, 5, false);
			 //2, 画出下边的矩形
			 g.fill3DRect(x, y+15, 30, 5, false);
			 //3, 画出中间矩形
			 g.fill3DRect(x+5, y+5, 20, 10, false);
			 //4, 画出圆形
			 g.fillOval(x+10, y+5, 10, 10);
			 //5, 画出线
			 g.drawLine(x+15, y+10, x, y+10);
			
			 break;
		default:
			break;
		}		
		
	}

	/**********		监听键盘		***********/
	// 按键处理,  a表示向左, s表示向下,  w表示向上,  d表示向右
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
				
			//设置坦克的方向
			this.hero.setDirect(0);
			//设置坦克的移动
			this.hero.moveUp();
			
			break;
		case KeyEvent.VK_D:
			this.hero.setDirect(1);
			this.hero.moveRight();
			break;
		case KeyEvent.VK_S:
			this.hero.setDirect(2);
			this.hero.moveDown();
			break;
		case KeyEvent.VK_A:
			this.hero.setDirect(3);
			this.hero.moveLeft();
			break;
		default:
			break;
		}
		
		//判断是否按下j键
		if (e.getKeyCode() == KeyEvent.VK_J) {
			
			if (this.hero.ss.size() <= 4) {
				//开火
				this.hero.shotEnemy();
				
			}
		}
		
		
		//必须重新绘制panel
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//每个100毫秒, 重画子弹
		while (true) {
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			//判断是否击中
			//取出子弹
			for (int i = 0; i < this.hero.ss.size(); i++) {
				Shot s = this.hero.ss.get(i);
				//判断子弹是否有效
				if (s.isLive == true) {
					
					//取出敌人的坦克
					for (int j = 0; j < this.ets.size(); j++) {
						EnemyTank et = this.ets.get(j);
						//判断敌人坦克是否还活着
						if (et.isLive == true) {
							
							this.hitTank(s, et);
						}
					}
					
					
				}
			}
			
			
			this.repaint();
			
		}
		
	}
	
	
	
	
}





