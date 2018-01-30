package com.java.first;

public class Excercise {
	
	public static void main(String[] args) {
		Excercise test=new Excercise();
		
		System.out.println(test.add(10,20));
		System.out.println(test.sub(30,10));
		System.out.println(test.mul(10,10));
		System.out.println(test.div(200,10));
		
	}
		public int add(int a ,int b){
			
			return a+b;
		}
		public int sub(int a,int b){
			return a-b;
		}
		public int mul(int a,int b){
			return a*b;
	}
		public int div(int a,int b){
			
			return a/b;
	}
}
