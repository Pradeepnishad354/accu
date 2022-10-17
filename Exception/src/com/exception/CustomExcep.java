package com.exception;


class YoungerAgeException extends RuntimeException{
	
	YoungerAgeException(String s){
		
		
		
		super(s);
	}	
}
class OldAgeException extends RuntimeException{
	
	
	public OldAgeException(String s) {
		
		super(s);
		
	}	
}
public class CustomExcep  {
	
	
	public static void main(String[] args) {
		
		int  age =61;
		
		if(age>60) {
			
			throw new YoungerAgeException("please wait some more time you will find best match");
				
		}else 
			if(age<18) {
				throw new OldAgeException("your age is already cross no chnace for getting married ");
			}
		
		
		System.out.println("this marriage check");
		
		
	}
	
	

}
