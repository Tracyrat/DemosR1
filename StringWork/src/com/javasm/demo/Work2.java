package com.javasm.demo;

/*
 统计一个字符串在另一个字符串中出现的次数
 * 
 * 
 * 
 */
public class Work2 {

	public static void main(String[] args) {
		String str1="abchellodfghidhellowelchellomm";
		String str2="hello";
		int j;
		int index=0;
		int number=0;
		for(int i=0;i<str1.length();i++) {
			for(j=index;j<str2.length();) {
				if(str2.charAt(j)!=str1.charAt(i)) {
					break;
				}else {
					index++;
					if(index==str2.length()-1) {
						
						number++;
						index=0;
						
					}
					break;
				}
			}
		}
		
		System.out.println(number);
	}
	
}
