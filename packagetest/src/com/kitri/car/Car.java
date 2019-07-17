package com.kitri.car;

public class Car {
	private String name; // 접근제어자 안쓰면 default인데 같은 package안에서만 사용가능함
	private String color; // 하지만 바꿀 수 있는 값을 private로 막는게 좋음
	private String maker;
	private int speed;

	public Car(String name) {
		super();
		this.name = name;
	}

	// 생성자
	public Car(String name, String color, String maker) {
		super();
		this.name = name;
		this.color = color;
		this.maker = maker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", maker=" + maker + ", speed=" + speed + "]";
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}