package com.java.first;

public class Calculator {

	public static void main(String[] args) {

		Calculator one=new Calculator();
		one.add();
		one.sub();
		one.mul();
		one.div();
	}

	void add()
	{
		int i=20;//local variable
		int j=10;
		int c=i+j;
		System.out.println(c);
		
	}
	void sub()
	{
		int i=20;
		int j=10;
		int c=i-j;
		System.out.println(c);
	}
	void mul()
	{
		int i=20;
		int j=10;
		int c=i*j;
		System.out.println(c);
	}
	void div()
	{
		int i=20;
		int j=10;
		int c=i/j;
		System.out.println(c);
	}
}
