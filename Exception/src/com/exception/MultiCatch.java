package com.exception;

public class MultiCatch {
	
	public static void main(String[] args) {
		
		
		
		int array[]= {10,30,40};
		
		int num1=10 ,num2=0;
		
		int res=0;
		
		try {
			
			res=num1/num2;
			
			for(int n=2; n>=0; n--) {
				
				System.out.println("result"+array[n]);
			}}catch(ArithmeticException e) {
				
				System.out.println(e);
			}catch(ArrayIndexOutOfBoundsException e) {
				
				e.printStackTrace();
				
				
			}
				
				
			}
			
			
		}
		
		
		
	


