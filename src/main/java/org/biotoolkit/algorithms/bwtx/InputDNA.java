package org.biotoolkit.algorithms.bwtx;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

/**
*  SCHILLER LAB SOFTWARE
*  PROJECT: Exam generator
*  TOPIC: Program generates exams and different version of exams with keys.  
*  It uses a question and answer database
*  DATE: 7/6/14
*  @author Martin Schiller
*  WEBSITE: http://docs.oracle.com/javase/6/docs/api/
*  EXTERNAL DOCUMENT NAME:
*  EXTERNAL DOCUMENT LOCATION:
* InputDNA class determine what to take in as input. a user entered DNA sequence, website, or mysql database
*/

public class InputDNA 
{
/**
* main method records scanner input of choice of type of input DNA, (1) DNA sequence, (2) accession 
* number looked up on RefSeq, (3) mysql database
* @param  scanner input
* @return dna input
*/	
public static void main(String[] args) // change to input selector when testing id done.
	//public static String inputSelector()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What type of input would you like?");
		System.out.println("(1) DNA sequence, (2) accession number looked up on RefSeq, (3) mysql database");
		int inputchoice = kb.nextByte();
		String dnainput = new String();
		try  // JAY IF I MOVE THIS TO A METHOD IT CALLS OTHER METHOD FROM IT, but I need to pass input dna object to other lcass
		
		{
			System.out.println("You have selected option " + inputchoice);
			if (inputchoice == 1) // use cases instead
			{
				dnainput = userEntry();  // need to change so that other methods are not called from this method, when it is not main
			}
			if (inputchoice == 2)
			{
				dnainput = webRetrieval();
			}
			if (inputchoice == 3)
			{
				//String[] dnainput = btwx.MysqlTableAcccess.alMDS; // different input pipeline
			}
		}
		catch (Exception InputMismatchException)
		{
			if (inputchoice != 1 || inputchoice != 2 || inputchoice != 3) 
				{
				System.out.println("Please select 1, 2, or 3" );			
				}
		} 
		//while (true) return dnainput; // JAY SHOULD I TAKE THIS OUT OF MAIN SO I AM NOT STATIC AND CAN GET RETURN VALUE
	}

	//----------------------- end of main method ---------------------------------
	
	/**
	 * Method takes a DNA input sequence from keyboard entry
	 * @param 
	 * @return dnainput1
	 */
	private static String userEntry() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Insert the DNA sequence");
		String dnainput1 = kb.nextLine().toUpperCase();
			if (dnainput1.matches("^[ATCG]+$"))
			    {
			      System.out.println("You have selected the sequence " + dnainput1);
			    }
			    else
			    {
			      throw new IllegalArgumentException("DNA sequences should only contain A, T, C, G charaters");
				// System.out.println("Your DNA sequences should only have G, A, T, C as valid characters" );			
				}
		 return dnainput1;
	}
	
	/**
	 * This method takes an accession number to the refseq website and returns accession sequence into dnainput
	 * @param
	 * @return dnainput2
	 */
	private static String webRetrieval() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Insert the RefSeq accession number, e.g.NM_003947.4 ");
		String acessionnum = kb.nextLine().toUpperCase();
		System.out.println("You have selected the accession number " + acessionnum);
		String dnainputx="";	
		String dnainput2="";
			   try {
					// get URL content
					URL url = new URL("http://www.ncbi.nlm.nih.gov/nuccore/" + acessionnum + "?report=fasta&log$=seqview");
					URLConnection conn = url.openConnection();
		 
					
					// open the stream and put it into BufferedReader
					
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					dnainputx = br.readLine();
					
					while ((dnainputx = br.readLine()) != null) {
				         dnainput2 += dnainputx;
				     }
				     br.close();
					
					/**
					 * 
					take line after mRNA - still need to do.
					StringTokenizer dnainputx = new StringTokenizer(br, "mRNA"); // JAY WHY I IMPORTED THE CORRECT CLASS
					String dnainput2 = dnainputx.nextToken();   
					while (dnainput2.hasMoreElements()) {
					System.out.println(dnainput2.nextElement());
					}
					 */
					System.out.println(dnainput2); 
					
					} 
			   catch (MalformedURLException e) 
				{
					e.printStackTrace();
				} 
			   catch (IOException e) 
				{
					e.printStackTrace();
				} 
			 return dnainput2;
	}
}
/**
 * OUPUT
 * output for option 2
 * What type of input would you like?
 * (1) DNA sequence, (2) accession number looked up on RefSeq, (3) mysql database
 * You have selected option 2
 * Insert the RefSeq accession number, e.g.NM_003947.4 
 * NM_003947.4
 * You have selected the accession number NM_003947.4
 * <?xml version="1.0" encoding="utf-8"?>
 */

