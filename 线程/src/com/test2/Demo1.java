/**
 * 使用线程的注意事项
 */
package com.test2;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Cat cat1 = new Cat();
//		cat1.start();
//		cat1.start();
		
//		Dog dog1 = new Dog();
//		Thread t = new Thread(dog1);
//		t.start();
//		t.start();
		
	}

}

class Cat extends Thread {
	
	public void run(){
		System.out.println("11");
	}
	
}

class Dog implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("22");
	}
	
}

