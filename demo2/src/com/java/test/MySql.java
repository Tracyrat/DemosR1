package com.java.test;

import Interfaces.DaoService;

public class MySql implements DaoService{

	@Override
	public void add() {
		System.out.println("����������ݵ�mysql���ݿ�");
		
	}

	@Override
	public void update() {
		System.out.println("���ڸ������ݵ�mysql���ݿ�");
		
		
	}

	@Override
	public void show() {
		System.out.println("������ʾ���ݵ�mysql���ݿ�");
		
	}

}
