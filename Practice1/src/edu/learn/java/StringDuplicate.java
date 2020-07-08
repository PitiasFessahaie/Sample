package edu.learn.java;

import java.util.HashMap;
import java.util.Iterator;

public class StringDuplicate {

	public static void main(String[] args) {
		duplicate("I am am am the the the coder man man");
	}

	private static void duplicate(String sent) {
		HashMap<String, Integer> data = new HashMap<>();
		String [] lst = sent.split(" ");
		for(String s:lst) 
		{
			if(data.get(s)!=null) {
				data.put(s, data.get(s)+1);
			}else {
			data.put(s, 1);}
			
		}
		Iterator<String> word = data.keySet().iterator();
		
		while(word.hasNext())
		{
		String l = word.next();
	
	
			if(data.get(l)>1) {
			
			System.out.println("The word "+l+" = " +data.get(l) );
		      }
			
		}
		
	}


}
