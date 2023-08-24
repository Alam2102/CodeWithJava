package com.test;


import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.sql.SQLException;
import java.text.ParseException;

class MyException2 {

	void doSomething() throws IllegalArgumentException {
		// ...
	}
}

class MyException1 extends MyException2 {

	void doSomething() throws ArithmeticException,BufferOverflowException {

	}
}