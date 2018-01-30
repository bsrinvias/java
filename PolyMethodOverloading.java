package com.java.first;

public class PolyMethodOverloading {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyMethodOverloading test=new PolyMethodOverloading();
		test.sum(10,20);
		test.sum(10,20,30);
		test.sum(10,20,30);
	}

	

	public void sum(int i,int j)
	{
		System.out.println(i+j);
	}
	private void sum(int i,int j,int k)//different no of arguments
	{
		System.out.println(i+j+k);
	}
	
	int  sum(int i,int j,float k)//different data types
	{
		System.out.println(i+j+k);
		return 0;
	}
}

//any data type is find and any access modifier is fine
// Polymorphism- many forms
//Method overriding
//Method overloading-differentiate different no of arguments or different types of data types