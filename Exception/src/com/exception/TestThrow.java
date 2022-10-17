package com.exception;

class TestThrow {
	
	
	public static void validate(int age) {
		try {
		if(age<18) {
			
			throw new ArithmeticException("you are not eligible for voting");	
			
		}
		
		else {
			
			System.out.println("you are eligible for waiting ");
		}
		
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("exception handled");
			
		
		}
		
			
		}
	
public static void main(String[] args) {
	
TestThrow.validate(14);
	
}


	
	
}