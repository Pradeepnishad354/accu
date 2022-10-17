package com.exception;

public class ExceptionPropagation1 {
	void m() {
		
		int a=6 ,b=0,c;
		
		c=a/b;
	}
	
	void n() {
		
		m();
	}
	
	void p() {
		try {
		n();
	}catch(Exception e) {
		
		System.out.println(e);
	}
		
	}

	public static void main(String[] args) {
		ExceptionPropagation1 ex=new ExceptionPropagation1();
		
		ex.p();
		
		
	}
}
