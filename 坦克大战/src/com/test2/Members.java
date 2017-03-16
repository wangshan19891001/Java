package com.test2;

//子弹
class Shot implements Runnable{
	
	int x;
	int y;
	int direct;
	int speed = 1;
	//是否还活着
	boolean isLive = true;
	
	public Shot(int x, int y, int direct){
		this.x = x;
		this.y = y;
		this.direct = direct;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			switch(this.direct){
			
			case 0:
				this.y -= this.speed;
				break;
				
			case 1:
				this.x += this.speed;
				break;
				
			case 2:
				this.y += this.speed;
				break;
				
			case 3:
				this.x -= this.speed;
				break;
				
			default:
				break;
			
			}
			
			//子弹何时销毁
			if (x<0 || x> 400 || y<0 || y>300) {
				this.isLive = false;
				break;
			}
			
			
		}
		
		
	}
}


//坦克
class Tank {
	
	//表示坦克的x轴
	int x = 0;
	//坦克的y轴
	int y = 0;
	
	//坦克方向
	//0 表示上,  1表示右, 2 表示下, 3表示左
	int direct = 0;
	
	//坦克的速度
	int speed = 5;
	
	//坦克的颜色
	int color;
	
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDirect() {
		return direct;
	}

	public void setDirect(int direct) {
		this.direct = direct;
	}

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
	
	Shot s = null;
	
	public Hero(int x, int y){
		super(x,y); //父类的构造函数
	}
	
	public void moveUp(){
		this.y -= this.speed;
	}
	
	public void moveRight(){
		this.x += this.speed;
	}
	
	public void moveDown(){
		this.y += this.speed;
	}
	
	public void moveLeft(){
		this.x -= this.speed;
	}
	
	
	//开火
	public void shotEnemy(){
		
		switch (this.direct) {
		case 0:
			s = new Shot(x+10, y, 0);
			break;
		case 1:
			s = new Shot(x+30, y+10, 1);
			break;
		case 2:
			s = new Shot(x+10, y+30, 2);
			break;
		case 3:
			s = new Shot(x, y+10, 3);
			break;
		default:
			break;
		}
		
		Thread t = new Thread(s);
		t.start();
		
	}
	
	
	
}


//敌人的坦克
class EnemyTank extends Tank{

	public EnemyTank(int x, int y) {
		super(x, y);
		
	}
	
}

