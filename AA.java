package com.test;

interface EE {

	public static void log() {
		System.out.println("called interface log method");
	}

}

interface AA extends EE {
	public static void log() {
		System.out.println("called interface log method");
	}

}
