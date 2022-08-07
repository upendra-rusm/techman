package com.techman.java;

// Prime number is greater then 1 and divided by 1 or itself 
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("is not prime");
		checkPrime(16);

	}
	
	public static void checkPrime(int num)
	{
		System.out.println("this is ")	;
		
		if(num==0 || num==1)
			System.out.println(num +"is not prime");
		int i=2;
		boolean isPrime=false;
		
		while(i<=num/2)
		{
			if(num%i==0)
			{
				isPrime=true;
				break;
			}			
			
			i++;			
		}
		
		if(!isPrime)
			System.out.println(num+ "num is prime");
		else
			System.out.println(num+ "num is not prime");
		
	}

}
