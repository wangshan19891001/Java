package com.interfaces;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer computer = new Computer();
		
		Camera camera = new Camera();
		
		Phone phone = new Phone();
		
		computer.useUsb(camera);
		
		computer.useUsb(phone);
		
		
		
	}
	
	

}

interface Usb {
	int a = 1;
	public void start();
	public void stop();
}

class Camera implements Usb{
	
	public void start(){
		System.out.println("camera start");
	}
	
	public void stop(){
		System.out.println("camera stop");
	}
	
}	


class Phone implements Usb{
	
	public void start(){
		System.out.println("Phone start");
	}
	
	public void stop(){
		System.out.println("Phone stop");
	}
	
}

class Computer {
	
	public void useUsb(Usb usb){
		usb.start();
		usb.stop();
	}
	
}



