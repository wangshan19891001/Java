package com.test1;

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
	
}


//敌人的坦克
class EnemyTank extends Tank{

	public EnemyTank(int x, int y) {
		super(x, y);
		
	}
	
}

