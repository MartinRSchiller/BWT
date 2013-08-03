package org.biotoolkit.algorithms.bwtx;

import junit.framework.Assert;

import org.junit.Test;


/**
*  PROJECT: Burrows Wheeler transform of a DNA sequence
*/
public class BWTCompressorTest 
{
	//test to check for BWTCompress  "zGTCGaACTTT"
	@Test
	public void testCompress() 
	{	
		String compresstest = BWTCompressor.compress("zGTCGaACTTT", 11);  // object = class.method(test arguments)
		String compresstest2 = BWTCompressor.compress("zGTCGaACAAA", 11);
		Assert.assertEquals("Output of class" , "zGTCGaACT3", compresstest.toString());
		Assert.assertEquals("Output of class" , "zGTCGaACA3", compresstest2.toString());// expected result, object
	}
}