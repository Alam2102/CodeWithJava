package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStringUtility {
	@Test
	public void testgetMirrorImage(){
		String input="EARTH";
		StringUtilityMirrorImage utility=new StringUtilityMirrorImage();
		String outPutimage=utility.getMirrorImage(input);
		
		assertEquals(outPutimage, "EARTH||HTRAE");
		
	}

}
