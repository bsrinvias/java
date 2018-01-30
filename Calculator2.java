package com.java.first;

public class Calculator2 {
	
	public static void main(String[] args) {
		
		Calculator2 test =new Calculator2();
		test.add(10,20);
		test.sub(20, 10);
		test.mul(10, 20);
		test.div(200, 10);
		

	}

	public void add(int a,int b){
		
		System.out.println(a+b);
	}
	public void sub(int a,int b){
		
		System.out.println(a-b);
	}
	public void mul(int a,int b){
		System.out.println(a*b);
	}
	public void div(int a,int b)
	
	{
		System.out.println(a/b);	
	}
}
