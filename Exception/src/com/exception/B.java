package com.exception;

public class B {
	public static void main(String[] args) {
		
		try {
		String s=null;
		
		System.out.println(s.length());
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("array index bouid exception  occurs");
		}catch(ArithmeticException e) {
			
			System.out.println("Arithmetic exception occurs");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception ");
		}
	}

}
