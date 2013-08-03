package org.biotoolkit.algorithms.bwtx;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.dtd.XMLContentSpec.Provider;

public abstract class DNAInputProvider {
    
    public boolean validate=true;
    public String getDNAString(){
        
        String s = provideDNAString();
        if(validate){
            /**
             * Validate the string before returning.... probably will comment this out 
             * for performance later. 
             */
            for(char nuc: s.toCharArray()){
                if(! "AGCT".contains(nuc+"")){
                    /**
                     * Blow up if the character is not a valid nucleotide.
                     */
                    throw new RuntimeException("Bad char in DNA STring ! " + nuc);
                }
            }
        }

        /**
         * If we survive this far, its a valid string :) 
         */
        return s;
        
    }
    
    /**
     *  This method implemented by classes, not part of public contract. 
     *  Subclasses don't need to worry about validating input, we will do that in the public method above.
     */
    protected abstract String provideDNAString();
}
