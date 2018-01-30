package com.java.first;

public class Encapsulation {
 private int age;
 public void setAge(int age)
 {
	 if(age<=0)
	 {
		 System.out.println("invalid age");
	 }
	 else{
		 this.age=age;
	 }
 }
 public String getROI()
 {
	 if(age<=18)
	 {
		 return "ROID is 10%";
	 }
	 else if(age>19 && age<60){
		 return "ROID is 12%";
	 }
	 else{
		 return "ROID is 14%";
	 }
 }
}

//instance variable should be private
//use setter and getter methods to fetch or replace variable
//getter method should have return type