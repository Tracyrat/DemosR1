package com.javasm.obj;

public class Car {
	public String name="¸¸Àà×Ö¶Î";
	private String color;
	private int wheelnum;
	public int num=3;
	
	
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

	public int getWheelnum() {
		return wheelnum;
	}

	public void setWheelnum(int wheelnum) {
		this.wheelnum = wheelnum;
	}

	public void running(Car car)
	{
		
		System.out.println(car.name+" "+car.color+" "+car.wheelnum+" ÕýÔÚÅÜ");
	}
	
	public void calculating(Car car)
	{	if(car instanceof Benz)
			car.wheelnum+=1;
		System.out.println(wheelnum);
		
	}
	public Car(String name, String color, int wheelnum) {
		super();
		this.name = name;
		this.color = color;
		this.wheelnum = wheelnum;
	}
	public Car() {
		super();
		System.out.println(this);
		System.out.println(this.num);
	}
	
	
	
}
