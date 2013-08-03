package org.biotoolkit.algorithms;


public class BWTApplicationUsageExample{

    /**
     * Example of how to launch the program from a jar :
     */
    public static void main(String[] args){
        //Eqivalent of "java -jar myjar.jar org.biotoolkit.algorithms.bwtx.DNAInputProviderINTERACTIVE"
        //We will also have to update maven manifest to use the bwt class as the default main.
        BWTApplication.main(
           /**
            * All java main methods take a string array as input.  So, we have to wrap the 
            * DNA class name in a string array to compile.
            */
           new String[]{
                "org.biotoolkit.algorithms.bwtx.DNAInputProviderINTERACTIVE"
        });
    }
}
