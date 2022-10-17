package com.exception;

public class NestedTryBlock {
	public static void main(String[] args) {
		
		try {
			
			
			try {
				
				System.out.println("divided by 0");
				
				int a=20/0;	
				
			}catch(ArithmeticException e) {
				
				e.printStackTrace();
			}
			
			try {
				
				
				int a[]=new int[5];
				
				a[5]=5;
			}catch(ArrayIndexOutOfBoundsException e) {
				
				e.printStackTrace();
				
				
			}catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}finally {
			
			
			System.out.println("this is finally block");
		}
		
		
		
		
		
	}

}
