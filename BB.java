package com.test;

public class BB implements AA {
	
	public void log() {
		System.out.println("called concrete log method");
	}
	
	public static void main(String[] args) {
		//AA a1=new AA();// interface can't be instantiated
		AA.log();
		AA a2=new BB();
		
		BB b1=new BB();
		b1.log();
		
	}

	

}
