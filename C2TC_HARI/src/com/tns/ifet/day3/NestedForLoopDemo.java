package com.tns.ifet.day3;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int beg=5;
		int end=10;
		for (int i=beg;i<=end;i++) 
		{
		for (int j=1;j<=5;j++) 
		{
		System.out.println(i+"*"+j+"="+i*j);
		}
		System.out.println();
		}

	}

}
