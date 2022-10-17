package com.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrow2 {
	
	
	public static void method() throws FileNotFoundException {
		
		
		
		FileReader fr=new FileReader("c://Users/home.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		throw new FileNotFoundException();	
		
	}
	public static void main(String[] args) {
		
		try {
			method();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("+++++++++++");
		
	}

}
