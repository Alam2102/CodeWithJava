package com.test;

public class StringUtilityMirrorImage {

	public String getMirrorImage(String input) {
		final String Method_name = "getMirrorImage";
		System.out.println("Method invoked:" + this.getClass().getName() + ":" + Method_name + ":" + input);
		String outputImage = null;
		if (input == null) {
			throw new NullPointerException("Input might be Null reference,Please take care.");
		}
		if (input.isEmpty()) {
			throw new NullPointerException("Input might be Emoty String,Please take care.");
		} else {

			outputImage = input.concat("||").concat(new StringBuffer(input).reverse().toString());
		}
		System.out.println("Method EExit:" + this.getClass().getName() + ":" + Method_name + ":" + outputImage);
		return outputImage;

	}

	public static void main(String[] args) {
		StringUtilityMirrorImage utility = new StringUtilityMirrorImage();
		System.out.println(utility.getMirrorImage("EARTH"));
	}

}
