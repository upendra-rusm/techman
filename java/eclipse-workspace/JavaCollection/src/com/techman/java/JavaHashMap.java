package com.techman.java;

import java.util.*;

public class JavaHashMap {
	
	
	public static void main(String[] args)
	{
		HashMap<String,Integer> map1=new HashMap<>();
		
		map1.put("key1", 1);
		map1.put("key2", 2);
		map1.put("key3", 3);
		
		for(Map.Entry m : map1.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }
		
		
		
		Map map=new HashMap();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    //Traversing Map  
	    Set set=map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
	}

}
