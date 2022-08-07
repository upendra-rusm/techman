package com.techman.java;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generateFinonacci(10);
		generateFinonacciRecursoin(0,1,10);
	}
	
	
	public static void generateFinonacci(int count)
	{
		int num1=0 , num2=1,sum=0;
		System.out.print(num1+" "+num2);
		while(count>=0)
		{
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(" "+sum);
			count--;
		}
		
		
	}
	
	public static void generateFinonacciRecursoin(int num1,int num2,int count)
	{
		int sum=0;
		
		if(count>=0)
		{
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(" "+sum);
			generateFinonacciRecursoin(num1,num2,count-1);
		}	
		
	}

}
