package com.javasm.demo;

import java.util.Scanner;

public class StringConcatWork {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		char[] ch=str.toCharArray();
		char[] ch1=new char[16];
		int m=0;
		int j=1;
		if(ch[0]>='A'&&ch[0]<='Z') {
			m++;
			ch1[0]=ch[0];
			for(int i=1;i<ch.length;i++) {
				if(ch[i]>='A'&&ch[i]<='Z') {
					ch1[j]=ch[i];
					j++;
						
				} 
				
			}
			System.out.println("该字符串有"+m+"个大写字母，分别为：");
			for (char c : ch1) {
				System.out.print(c);
			}
		}else {
			System.out.println(str);
		}
	}
}
