package com.techman.java;

public class MultilevelInheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Puppy dog =new Puppy();
		dog.getInfo();
	}

}

class Puppy extends Dog
{
	public void getInfo()
	{
		//super.getInfo();
		System.out.println(" Puppy Dog get info");
	}
}