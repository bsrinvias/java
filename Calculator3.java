package com.java.first;

public class Calculator3 {
	public static void main(String[] args) {
		Calculator3 test =new Calculator3();
		int c=test.add(10,20);
		System.out.println(c);
		System.out.println(c+10);
		int d=test.sub(10,20);
		System.out.println(d);
		System.out.println(d+20);
		int e=test.mul(10,20);
		System.out.println(e);
		int f=test.div(10,20);
		System.out.println(f);
	}
	public int add(int a,int b)
	{
		return a+b;
	}

	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public int mul(int a,int b)
	{
		return a*b;
	}
	
	public int div(int a,int b)
	{
		return a/b;
	}
}
