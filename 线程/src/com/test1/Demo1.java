package com.test1;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Cat cat = new Cat();
//		//启动线程, 会导致run函数的运行
//		cat.start();
		
		Dog dog = new Dog();
		//启动线程
		//先创建一个Thread对象
		Thread t = new Thread(dog);
		t.start();
	}

}


class Cat extends Thread {
	
	//重写run函数
	public void run(){
		
		while (true) {
			
			try {
				
				//休眠一秒
				//1000表示1000毫秒
				//sleep 会让线程进入 Blocked状态, 并释放资源
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello world");
		}
		
		
	}
	
}

class Dog implements Runnable{

	@Override
	public void run() {
		
		while (true) {
					
					try {
						
						//休眠一秒
						//1000表示1000毫秒
						//sleep 会让线程进入 Blocked状态, 并释放资源
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("hello world");
		}
		
	}
	
}

