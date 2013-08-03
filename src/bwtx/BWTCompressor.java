package bwtx;

import bwtx.bwt;

public class BWTCompressor 
{
	public static void main(String args[])  // ghetto unit test method. ASK JAY HOW TO FIX
	{
		compress("AGGGATCCTTT", 11);  // pass two inputs
		
		String bwtcompress = null;  // gives one output // send back to bwt class for print report.
		//System.out.println("");		
		//System.out.println("The compressed Burrows Wheeler Transform is: " + bwtcompress);
	}
	
	/** if the two character are not equal skip step
	 * if two characters are equal:
	 * need to spin through characters until characters are equal
	 * each spin needs to add to a counter
	 * when two characters are not equal counter stops
	 * when counter stops append number to string.
	 * @param seqbwt
	 * @param aseqlength
	 * @return bwtcompress
	 */
	
	public static String compress(String seqbwt, int aseqlength) 
	{
		String bwtcompress="";
		outerloop:
		for(int i = 0; i < aseqlength; i++) 
					{
						char charW = seqbwt.charAt(i);
						char charX = seqbwt.charAt(i+1);
						bwtcompress = bwtcompress + charW;
						//System.out.println(charW + " and " + charX);  // test print 
						//System.out.println("outerloop " + bwtcompress); // test print
						if (charW != charX) 
							continue outerloop;
							else 
							{
								int k = 1, count = 1;			
									while(charW == charX)
									{  
										count++;
										//System.out.println("count " + count); // test print
										if (i+count == aseqlength)
										{
											bwtcompress = bwtcompress + count;
											break outerloop;
										}
										char charY = charW;
										char charZ = charX;
										charY = seqbwt.charAt(k + i);
										charZ = seqbwt.charAt(k + i + 1);
										if (charY != charZ) 
											{
											bwtcompress = bwtcompress + count;
											//System.out.println("innerloop " + bwtcompress); // test print
											i = i + count -1;
											//System.out.println("i = " + i); // test print
											count = 1;
											break;
											} 
										k++;	
									}
							}	
					}
		
		System.out.println("return value " + bwtcompress); // test print
	return bwtcompress;
	}
}
/** 
 * OUTPUT for TEST MAIN METHOD
 *  AG3ATC2T3
 * 
 
 * notes on break and continue in loops
 * break - breaks inner iteration and end up in outer
 * continue - back to beginning of inner iteration
 * continue label 1 on outerloop  breaks inner and outer all the way back to outside the loop
 * break label 1 on outlerloop breaks all the way out of loop  and does not reenter iteration
 * 
 */


