package com.javasm.test;

import java.util.HashSet;

public class Test2 {

	
	public static void main(String[] args) {
		HashSet<News> set=new HashSet<>();
		News n1=new News("苹果mac系统","Tracy","xxxxxxxxxxx");
		News n2=new News("诺贝尔物理学奖","Ryan","xxxxxxhgggg");
		News n3=new News("苹果mac系统","Bob","hdhiwhix");
		set.add(n1);
		set.add(n2);
		set.add(n3);
		System.out.println(set);
		
	}
}
