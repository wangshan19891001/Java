package com.test;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal an = new Dog();
		an.cry();
		
		an = new Cat();
		an.cry();
		
		
	}

}

class Animal {
	
	int age;
	String name;
	
	public void cry(){
		System.out.println("animal cry");
	}
	
}

class Dog extends Animal{
	
	public void cry(){
		System.out.println("dog cry");
	}
}

class Cat extends Animal{
	
	public void cry(){
		System.out.println("cat cry");
	}
}

abstract class Pig {
	
}




