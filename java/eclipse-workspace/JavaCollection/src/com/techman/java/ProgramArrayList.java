package com.techman.java;

import java.util.*;

public class ProgramArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> list=new ArrayList<>(2);
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		
		
		
		System.out.println(list);
		
		
		list.stream()
		.forEach(i->System.out.println(i));
		
		for(String s:list)
		{			
			System.out.println(s);
		}
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{	
			String data=(String)itr.next();
			if(data=="3")
			itr.remove();
			
			System.out.println(data);
			
		}
		
		System.out.println(list);  
		
	}

}
