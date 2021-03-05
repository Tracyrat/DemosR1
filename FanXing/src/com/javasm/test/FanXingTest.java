package com.javasm.test;

public class FanXingTest {

	public static void main(String[] args) {
		
		/*
		 * 创建一个Apple泛型类，里面的weight属性属于参数化T类
		 * 创建三个对象，并把weight分别当作String，Integer，Double类型赋值并输出
		 * 
		 * 
		 */
		Apple<String> a1=new Apple<>();//实例化对象时必须给定泛型类型
		Apple<Integer> a2=new Apple<>();
		Apple<Double> a3=new Apple<>();
		a1.setWeight("500g");
		a2.setWeight(500);
		a3.setWeight(500.00);
		System.out.println(a1.getWeight());
		System.out.println(a2.getWeight());
		System.out.println(a3.getWeight());
		
		
	}
}
