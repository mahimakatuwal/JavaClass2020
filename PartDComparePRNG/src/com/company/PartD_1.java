package com.company;

import java.security.SecureRandom;

public class PartD_1 {

    public void genPRNG(){
        SecureRandom secureRandom = new SecureRandom();

        long randNum;
        randNum = secureRandom.nextLong();
        //System.out.println(randNum);

        String ConverttoBits = Long.toBinaryString(randNum);
        System.out.println("Random bits: "+ConverttoBits);
        System.out.println();
    }
}

