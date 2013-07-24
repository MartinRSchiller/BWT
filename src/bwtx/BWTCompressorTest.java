package bwtx;

import static org.junit.Assert.*;
import org.junit.*; 

/**
*  SCHILLER LAB SOFTWARE
*  PROJECT: Burrows Wheeler transform of a DNA sequence
*  TOPIC: This algorithm is use by Bowtie and Soap2 to align DNA sequences.
*  DATE: 7/21/14
*  @author Martin Schiller, rookie codee
*  @author Jay Vyas, advisor to rookie
*  WEBSITE: http://www.cs.washington.edu/education/courses/cse143/11wi/eclipse-tutorial/junit.shtml
*  			http://docs.oracle.com/javase/6/docs/api/   
*  			http://www.cs.utexas.edu/~scottm/cs307/codingSamples.htm
*  			http://apps.topcoder.com/wiki/display/tc/Writing+Java+Unit+Tests
*  COPYRIGHT: Copyright (c) 2013, SCHILLER LAB, UNIVERSITY OF NEVADA LAS VEGAS All rights reserved 
*
*  CLASS: This Class contains the Unit Tests for BWTCompressor class.
*/

public class BWTCompressorTest 
{
	//test to check for BWTCompress  "zGTCGaACTTT"
	@Test
	public void testCompress() 
	{	
		String compresstest = BWTCompressor.compress("zGTCGaACTTT", 11);  // object = class.method(test arguments)
		String compresstest2 = BWTCompressor.compress("zGTCGaACAAA", 11);
		assertEquals("Output of class" , "zGTCGaACT3", compresstest.toString());
		assertEquals("Output of class" , "zGTCGaACA3", compresstest2.toString());// expected result, object
	}

}