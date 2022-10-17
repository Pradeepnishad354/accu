package com.exception;

public class Ar {
	
	public static void main(String[] args) {
		
	try {
		
		int a[]=new int[5];
		
		a[4]=20/0;
		
  System.out.println(a[6]);
	}catch(ArithmeticException e){
		
		System.out.println(e);
		
	}catch(ArrayIndexOutOfBoundsException e) {
		
		e.printStackTrace();
	}	
		
	}

}
