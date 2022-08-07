package com.techman.java;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkPalindrome(124);

	}
	
	public static void checkPalindrome(int num)
	{
		int numRev=0,num2,numtemp=num;
		
		
		while(num!=0)
		{
			num2=num%10;
			numRev=(numRev*10)+num2;
			num=num/10;		
		}
		
		System.out.println(numRev);
		
		if(numtemp==numRev)
		{
			System.out.println("Plandrome");
		}
		else
			System.out.println("No Plandrome");
		
	}

}
