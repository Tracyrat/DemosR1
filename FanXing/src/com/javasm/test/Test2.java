package com.javasm.test;

import java.util.HashSet;

public class Test2 {

	
	public static void main(String[] args) {
		HashSet<News> set=new HashSet<>();
		News n1=new News("ƻ��macϵͳ","Tracy","xxxxxxxxxxx");
		News n2=new News("ŵ��������ѧ��","Ryan","xxxxxxhgggg");
		News n3=new News("ƻ��macϵͳ","Bob","hdhiwhix");
		set.add(n1);
		set.add(n2);
		set.add(n3);
		System.out.println(set);
		
	}
}
