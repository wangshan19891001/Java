/**
 * 网格布局 GridLayout
 */
package com.test4;

import java.awt.*;
import javax.swing.*;

public class Demo3 extends JFrame{
	
	JButton jb[] = new JButton[9];
	int size;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo3 demo3 = new Demo3();
		
	}
	
	public Demo3(){
		
		for(int i = 0; i < 9; i++){
			
			jb[i] = new JButton(String.valueOf(i));
			this.add(jb[i]);
		}
		
		this.setLayout(new GridLayout(3,3));
		
		this.setTitle("网格布局");
		this.setSize(300, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
	}
	
	

}
