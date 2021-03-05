package com.java.test;

import Interfaces.DaoService;

public class Test {

	public static void main(String[] args) {
		DaoService dao=new MySql();
		dao.add();
		dao.update();
		dao.show();
	}
}
