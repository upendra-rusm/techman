package com.techman.java;


// Factorial of n is the product of all postive descending integers 
// 5 = 5*4*3*2*1

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calculateFactorial(5);
		long res=calculateFactorialRecurssion(5);
		System.out.println(res);
	}
	
	public static long calculateFactorial(long num)
	{		
		
		long fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial ="+fact);
		
		return fact;
		
	}
	
	
	public static long calculateFactorialRecurssion(long num)
	{		
		
		if(num==0)
			return 1;
		else 	
		return (num * calculateFactorialRecurssion(num-1));
		
	}

}
