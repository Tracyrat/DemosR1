package com.tracy.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Tracy
 *判断字符串是否符合正则表达式需求
 */
public class RegeTest {
	public static void main(String[] args) 
	{
		test();
	}
	
	
	public static void test()
	{
		String name="Jim_12";
		String regex="(^[A-Z]{1})([a-z]{2,5})_([0-9]{1,2})$";
		//Pattern 查看正则表达式格式是否编写正确
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(name);
		boolean flag=matcher.matches();
		System.out.println(flag);
		
		
	}

}
