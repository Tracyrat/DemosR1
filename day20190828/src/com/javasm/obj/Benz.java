package com.javasm.obj;

public class Benz extends Car{
	public int num=4;
	
	public Benz() {
		super();
		
		System.out.println(this.num);
		// TODO Auto-generated constructor stub
	}

	public Benz(String name, String color, int wheelnum, String audio) {
		super(name, color, wheelnum);
		System.out.println("this is "+audio);
		// TODO Auto-generated constructor stub
	}
	
}
