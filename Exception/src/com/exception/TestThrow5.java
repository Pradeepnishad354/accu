package com.exception;


 class UserDefineException extends Exception{
	
		
	 public  UserDefineException(String str) {
		 
		 super(str);
		
		 
	 }
}

public class TestThrow5 {
	
	public static void main(String[] args) {
		try {
		throw new UserDefineException("user is  define exception");
		}
		catch(UserDefineException ude) {
			
			System.out.println(ude);
			System.out.println("caught the exception ");
			
	
		}
		
		
		
	}
	
	
	

}
