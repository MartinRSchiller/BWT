package bwtx;

import java.util.Scanner;

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
	 * @param args
	 * @return
	 */
	//public static void main(String[] args) 
	
	private static String dnaSelector(int inputchoice)
	{
	if (inputchoice == 1) // use case instead
	{
		String dnainput = userEntry();
	}
	if (inputchoice == 2)
	{
		String dnainput = webRetrieval();
	}
	if (inputchoice == 3)
	{
		//String[] dnainput = btwx.MysqlTableAcccess.alMDS;
	}
	return dnainput; /// could remove and change this back to main.  remove main from other program and call??
	}

	//----------------------- end of main method ---------------------------------
	/**
	 * @param
	 * @return
	 */
	private static int inputSelector()
	{
		// try catch for integers not 1-3
		Scanner kb = new Scanner(System.in);
		System.out.println("What type of input would you like?");
		System.out.println("(1) DNA seqeunce, (2) accession number looked up on RefSeq, (3) mysql database");
		int inputchoice = kb.nextByte();
		try
		{
			System.out.println("You have selected option " + inputchoice);
			if (inputchoice == 1 || inputchoice == 2 || inputchoice == 3); 
		}
		catch (Exception InputMismatchException)
		{
			if (inputchoice != 1 || inputchoice != 2 || inputchoice != 3) 
				{
				System.out.println("Please select 1, 2, or 3" );			
				}
		} while (true) return inputchoice;
		
	}
	

	/**
	 * Method takes a DNA input sequence from keyboard entry
	 * @param 
	 * @return dnainput
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
			      throw new IllegalArgumentException("DNA Sequences should only contain A, T, C, G charaters");
				// System.out.println("Your DNA sequences should only have G, A, T, C as valid characters" );			
				}
		 return dnainput1;
	}
	
	/**
	 * This method takes and accession number, tos to the refseq website and returns accession sequence into dnainput2
	 * @param
	 * @return dnainput2
	 */
	private static String webRetrieval() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Insert the RefSeq accession number e.g.NM_003947 ");
		String dnainput2 = kb.nextLine().toUpperCase();
			
			   System.out.println("You have selected the sequence " + dnainput2);
			   //http://www.ncbi.nlm.nih.gov/nuccore/NM_003947.4?report=fasta&log$=seqview
			   
			   //parse based on origin. need to remove whitespace and numberical character.
			   // take line after mRNA
		 return dnainput2;		
	}	
}


