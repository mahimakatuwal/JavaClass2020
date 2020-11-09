package com.company;

import java.security.SecureRandom;

public class Main {
    /*
    AliceBits() method returns biased number of bit strings
    with different probabilities for zeros and ones.
     */
    public static int AliceBits(){
        SecureRandom secureRandom =new SecureRandom();
        double prob = secureRandom.nextDouble();
        while(prob > secureRandom.nextDouble()){
            return 0;
        }
        return 1;
    }

    /*
    Unbiased() method will return both zeros and ones with
    equal probability i.e. 0.50.
     */
    public static int unbiased(){
        int p0 = AliceBits();
        int p1 = AliceBits();

        if(p0 == 0 & p1 == 1){
            return 0;
        }
        if(p0 == 1 & p1 == 0){
            return 1;
        }
        return unbiased();

    }

    /*
    Main method iterates the unbiased bits and stores in bits.
    Count variable counts number of zeros and ones in the bit string.
     */
    public static void main(String[] args) {
        String biasedbits = "";
        String bits = "";
        for (int i = 0; i < 1000; i++) {
            biasedbits = biasedbits + String.valueOf(AliceBits());
            bits = bits + String.valueOf(unbiased());
        }
        //System.out.println(biasedbits);
        //System.out.println(bits);
        int count0 = 0;
        int count1 = 0;
        for(int j = 0; j < bits.length(); j++){
            if(bits.charAt(j) == '0'){
                count0 += 1;
            }
            else{
                count1 +=1;
            }
        }
        System.out.println("Number of 0s in unbiased bits: " + count0);
        System.out.println("Number of 1s in unbiased bits: " + count1);
        System.out.println("Probability of 0s in unbiased bits: "+ ( String.format("%.1f", (double)count0/1000.00)));
        System.out.println("Probability of 1s in unbiased bits: " + (String.format("%.1f", (double)count1/1000.00)));
    }
}
