package edu.learn.java;

public class StringRevrse {

	public static void main(String[] args) {
		
		
		String r1 = "This is a great time to Enjoy I like it?";
		String r ="Hellow !!!";
		int count = 0;
		for(int i =0;i<r1.length();i++) {
			if(r1.charAt(i)!= 0) {
				count ++;
			}
			
		}
		System.out.println("The number of the Strings are "+count);
		
		
		reverse(r);
		
	}

	private static void reverse(String r) {
		StringBuilder d = new StringBuilder(r);
		System.out.println(d.reverse());
		
	}
}
