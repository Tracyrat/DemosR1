package com.javasm.obj;

public class Bmw extends Car {
	
	private String shape;

	public Bmw() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bmw(String name, String color, int wheelnum,String shape) {
		super(name, color, wheelnum);
		this.shape=shape;
		System.out.println("this is "+shape);
		// TODO Auto-generated constructor stub
	}

	
}
