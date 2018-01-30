package com.java.first;

public class Calculator1 {

	int a=20; //public variables
	int b=10;
	public static void main(String[] args) {
		
		Calculator1 test= new Calculator1();
		test.add();
		test.sub();
		test.mul();
		test.div();
	}

	void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	void sub(){
		int c=a-b;
		System.out.println(c);
	}
	void mul()
	{
		int c=a*b;
		System.out.println(c);
	}
	void div()
	{
		int c=a/b;
		System.out.println(c);
	}
}
