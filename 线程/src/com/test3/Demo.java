package com.test3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//定义三个售票窗口
		TicketWindow tw1 = new TicketWindow();
		TicketWindow tw2 = new TicketWindow();
		TicketWindow tw3 = new TicketWindow();
		
		Thread t1 = new Thread(tw1);
		Thread t2 = new Thread(tw2);
		Thread t3 = new Thread(tw3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}

class TicketWindow implements Runnable {
	
	//一共两千张票
	private int nums = 2000;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			
			//
			if (nums > 0) {
				//显示售票信息
				System.out.println(Thread.currentThread().getName()+"在售出第"+nums+"张票");
				nums --;
			}
			else{
				System.out.println("售票结束");
				break;
			}
			
		}
		
		
	}
	
	
	
	
}

