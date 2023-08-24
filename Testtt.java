package com.test;

class Testt{
	static int c=0;
	 int multiply(int a,int b) {
		 return a*b;
	 }
	 static int add(int a,int b) {
		return a+b; 
	 }
	
}



 /**
 * @author MD NOOR ALAM
 *
 */
public class Testtt{
	 public static void main(String[] args) {
		 Testt t=new Testt();
		 t.c=10;
		 System.out.println(t.multiply(2, 2));
		 System.out.println(t.add(2, 3));
		 //compile time error
		// System.out.println(t.add(2, c));
		 
		
	}
	 
	 
 
 }
	


