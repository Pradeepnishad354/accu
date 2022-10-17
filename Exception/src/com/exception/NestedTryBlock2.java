package com.exception;

public class NestedTryBlock2 {

	public static void main(String[] args) {
		
	try {
		
		
		try {
			
			
			try {
				int a[]=new int[5];
				
				System.out.println(a[10]);
				
				
				
			}catch(ArithmeticException e) {
				
				e.printStackTrace();
				System.out.println("arithmetic ");
				
				
			}
		}
		catch(NullPointerException e) {
				e.printStackTrace();
				System.out.println("null pointe exception");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("array index out of bound exception");
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("exception ");
				
				
			}
		
		}
	
		
		
		
		
	
}
