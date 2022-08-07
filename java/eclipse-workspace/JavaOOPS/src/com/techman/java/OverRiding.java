package com.techman.java;

public class OverRiding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Vehicle{  
	  void run(){System.out.println("Vehicle is running");}  
	}  

class Bike2 extends Vehicle{  
	  //defining the same method as in the parent class  
	  void run(){System.out.println("Bike is running safely");}  
	  
}