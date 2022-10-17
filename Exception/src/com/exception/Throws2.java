package com.exception;

public class Throws2 {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		doStuff();
		
		
	}
	
	public static void doStuff() throws InterruptedException {
		
		doStuffMore();
	}
	
	public static void doStuffMore() throws InterruptedException {
		
		
		Thread.sleep(1000);
	}
	
}

