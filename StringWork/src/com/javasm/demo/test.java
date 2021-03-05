package com.javasm.demo;

public class test {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<2;i++) {
			int t=num[num.length-1];
			for(int j=num.length-1;j>=0;j--) {
				if(j>0&&j<num.length)
				{
					num[j]=num[j-1];
				}
				if(j==0)
				{
					num[j]=t;
				}
			}
			
		}
		for(int k:num) {
			System.out.print(k+" ");
		}
	}
}
