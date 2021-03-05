package com.javasm.constructortest;

public class User {
	String name;
	public void abc() {
		
		System.out.println(this);
		
		new Calculator().cal(this);
	}
}
