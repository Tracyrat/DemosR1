package com.javasm.test;

public class FanXingTest {

	public static void main(String[] args) {
		
		/*
		 * ����һ��Apple�����࣬�����weight�������ڲ�����T��
		 * �����������󣬲���weight�ֱ���String��Integer��Double���͸�ֵ�����
		 * 
		 * 
		 */
		Apple<String> a1=new Apple<>();//ʵ��������ʱ���������������
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
