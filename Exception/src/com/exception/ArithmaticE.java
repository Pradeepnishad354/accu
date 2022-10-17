package com.exception;

public class ArithmaticE {
	
	public static void main(String[] args) {
		
		try {
		int a=5,b=0;
		
		System.out.println(a/b);
	
		}catch(ArithmeticException e) {
			
	System.out.println(e);	
			
		}
		
		System.out.println("exception handle");
		//this program is normally terminate 
	}

}
