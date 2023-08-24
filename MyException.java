package com.test;


import java.io.FileNotFoundException;
import java.io.IOException;

public class MyException {

	public static void main(String[] args) {
		ioExcAndFileNotFoundEx();
		System.out.println("Executed");
	}

	public static void ioExcAndFileNotFoundEx() {
		try {
			String x = "abc";
			if (x.equals("abc")) {
				throw new IOException();
			} else {
				throw new FileNotFoundException();
			}
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.getMessage();

		}
	}

}
