package com.java.test;

import Interfaces.DaoService;

public class MySql implements DaoService{

	@Override
	public void add() {
		System.out.println("正在添加数据到mysql数据库");
		
	}

	@Override
	public void update() {
		System.out.println("正在更新数据到mysql数据库");
		
		
	}

	@Override
	public void show() {
		System.out.println("正在显示数据到mysql数据库");
		
	}

}
