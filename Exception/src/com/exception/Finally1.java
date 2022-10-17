package com.exception;

public class Finally1 {
	
	public static void main(String[] args) {
		try {
			
		
		int a=3,b=0,c;
		c=a/b;
		
		System.out.println(c);
		
		}catch(Exception e) {
			
			e.printStackTrace();
			
			System.out.println("exception handled ");
			
			
		}finally {
			System.out.println("finally block is always executed");
		}
		}
		
		
	}


