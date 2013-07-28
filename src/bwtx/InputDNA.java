package bwtx;

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
* inputSelector method records scanner input of choice of type of input DNA, (1) DNA seqeunce, (2) accession 
* number looked up on RefSeq, (3) mysql database
* @param  scanner input
* @return inputchoice
*/	
public static void main(String[] args) // change to input selector when testing id done.
	//public static String inputSelector()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What type of input would you like?");
		System.out.println("(1) DNA seqeunce, (2) accession number looked up on RefSeq, (3) mysql database");
		int inputchoice = kb.nextByte();
		String dnainput = new String();
		try
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
				//String[] dnainput = btwx.MysqlTableAcccess.alMDS; // diffent input pipeline
			}
		}
		catch (Exception InputMismatchException)
		{
			if (inputchoice != 1 || inputchoice != 2 || inputchoice != 3) 
				{
				System.out.println("Please select 1, 2, or 3" );			
				}
		} 
		while (true) return dnainput; 		
	}

	//----------------------- end of main method ---------------------------------
	
	/**
	 * Method takes a DNA input sequence from keyboard entry
	 * @param 
	 * @return dnainput
	 */
	private static String userEntry() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Insert the DNA sequence");
		String dnainput = kb.nextLine().toUpperCase();
			if (dnainput.matches("^[ATCG]+$"))
			    {
			      System.out.println("You have selected the sequence " + dnainput);
			    }
			    else
			    {
			      throw new IllegalArgumentException("DNA Sequences should only contain A, T, C, G charaters");
				// System.out.println("Your DNA sequences should only have G, A, T, C as valid characters" );			
				}
		 return dnainput;
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
			     
			   try {
					// get URL content
					URL url = new URL("http://www.ncbi.nlm.nih.gov/nuccore/" + acessionnum + "?report=fasta&log$=seqview");
					URLConnection conn = url.openConnection();
		 
					
					// open the stream and put it into BufferedReader
					// take line after mRNA - still need to do.
					BufferedReader br = new BufferedReader(
		                               new InputStreamReader(conn.getInputStream()));
					//StringTokenizer dnainputx = new StringTokenizer(url, "mRNA");
					String dnainput2 = nextToken(br, "mRNA");
					//while (dnainput2.hasMoreElements()) {
					//	System.out.println(dnainput2.nextElement());
					//}
					//System.out.println(dnainput2); // change it to dnainput
				} catch (MalformedURLException e) 
				{
					e.printStackTrace();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			  //String dnainput = dnainput2; //  Why is this a problem
			   
			   //System.out.println("You DNA sequence is " + url);  //testing only   	 
	}
	return dnainput2; //  Why is this a problem
}


