package com.techman.java;

public class SingleInheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog =new Dog();
		dog.getInfo();
	}

}


class Animal
{
	public void getInfo()
	{		
		System.out.println("Animal get info");
	}
}

class Dog extends Animal
{
	public void getInfo()
	{
		//super.getInfo();
		System.out.println("Dog get info");
	}
}
