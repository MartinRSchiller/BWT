package bwtx;

import static org.junit.Assert.*;
import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

/**
*  SCHILLER LAB SOFTWARE
*  PROJECT: Burrows Wheeler transform of a DNA sequence
*  TOPIC: This algorithm is use by Bowtie and Soap2 to align DNA sequences.
*  DATE: 7/21/14
*  @author Martin Schiller, rookie code
*  @author Jay Vyas, advisor to rookie
*  WEBSITE: http://docs.oracle.com/javase/6/docs/api/   
*  			http://www.cs.utexas.edu/~scottm/cs307/codingSamples.htm
*  			http://apps.topcoder.com/wiki/display/tc/Writing+Java+Unit+Tests
*  COPYRIGHT: Copyright (c) 2013, SCHILLER LAB, UNIVERSITY OF NEVADA LAS VEGAS All rights reserved 
*
*  CLASS: This Class aggregates all of the Unit Tests for bwtx package.
*/

public class bwtTest extends TestCase 
{
	/**
	 * Creates a test suite containing all Unit Tests
	 * for this component.
	 *
	 * @return A test suite containing all unit tests.
	 */
	//public static Test suite()
	public static void main(String[] args) // use main for testing then depricat
	
	{
		//TestSuite suite = new TestSuite();
		
		// Add accuracy, failure,  tests here. use expected parameters and return values
		// suite.addTestSuite(TestClass.class);
		
		//return suite;	
	}
	
	public class testBWT 
	{
		bwt bwttest = new bwt();
		BWTCompressor compressortest = new BWTCompressor();
		assertEquals("zGTCGaACT3", BWTCompressor("GGATCCTTT");
		// test to check for input sequence
		
		/**
		* Marty: Write your unit tests like this:
		*
		* 1) Call the function in the OTHER class. (i.e. bwt.java)
		* 2) Store the return value in a variable (i.e. aString)
		* 3) Assert something about that value (i.e. assertTrue, assertFalse).
		*/
		@Test
		public void testBWTExample(){
		String aString = bwt.aSimpleMethod();
		Assert.assertEquals(aString,"Look how easy junit is");
		Assert.assertTrue(aString.equals("Look how easy junit is"));
		Assert.assertFalse(1==0+2);
		}
		
		
		
		
		// test to check sequence length
		@Test
		public void testCalcSequenceLength()
		{		
			Assert.assertTrue(1==1); //always passes 
			Assert.assertTrue("GGATCCTTT".length()==9); //compare string length 
			Assert.assertTrue("aGGATCCTTTz".length()==11); //compare string alength
			
			//Assert.assertTrue("GGATCCTTT".sequenceRotateArray([1]) =="zaGGATCCTTT");
			//Assert.assertTrue(sequenceRotateArray("GGATCCTTT", 11) =="zaGGATCCTTT");
			Assert.assertFalse(1==0); //always passes 	
		}
		
		// test to check accuracy for append sequence
		@Test
		public void testSequenceAppend() 
		{
			String seqappend = "aGGATCCTTTz";
			Assert.assertTrue(1==1); 
			Assert.assertTrue("GGATCCTTT".sequenceAppend()=="aGGATCCTTTz"); 
			Assert.assertFalse(1==0); 	
		 }
		
			
		// test to check for sequence rotation of first array element
		@Test
		public void testCalculateSequenceLength() 
		{
		     
		      
		 }
		
		// test to check for sequence sore of first  and last array element
		@Test
		public void testCalculateSequenceLength() 
		{
			bwttest.seq("GGATCCTTT"); // input parameters here
			int seqlength= bwt.sequenceLength(bwttest);  //class.method(test object)
			assertEquals(9, seqlength, 0);
		}
		
		// test to check for bwt transform
		@Test
		public void testSequenceBWT() 
		{
			bwttest.sequenceBWT("xxxxxxxxxxx"); // input parameters here
			bwttest.seq("xxxxxxxxxxx");
	
			int seqlength= bwt.sequenceLength(bwttest);  //class.method(test object)
			assertEquals(zGTCGaACTTT, bwtseq, 0);
		}

		// test to check for BWTCompress 
		@Test
		public void testCompress() 
		{
			compressortest.compress("zGTCGaACTTT", 11); //test object.variable(instance parameter)
			String bwtcompress = BWTCompressor.compress(compressortest);  //class.method(test object)
			assertEquals("zGTCGaAC3", bwtcompress, "zGTCGaACTTT");  // expected result, return varaible, initial value
		}		
	}
	
	
}
