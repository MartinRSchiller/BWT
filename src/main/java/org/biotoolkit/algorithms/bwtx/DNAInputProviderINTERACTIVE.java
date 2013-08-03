package org.biotoolkit.algorithms.bwtx;

import java.util.Scanner;

public class DNAInputProviderINTERACTIVE extends DNAInputProvider{
    
    @Override
    public String provideDNAString(){
        // change to input selector when testing id done.
        //public static String inputSelector()
        System.out.println("Enter DNA String:");
        Scanner kb = new Scanner(System.in);
        return kb.nextLine();
    }

    /**
     * Example usage of this class.
     */
    public static void main(String[] args){
        System.out.println(new DNAInputProviderINTERACTIVE().provideDNAString());
    }
}
