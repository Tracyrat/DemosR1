package com.javasm.obj;

public class Driver {
	private String name;
	private int age;
	public void driving(Car car)
	{
		System.out.println(name+age+"ÕıÔÚ¿ª"+car.getName());
	}
	public Driver(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
