package com.company;

import jdk.swing.interop.SwingInterOpUtils;
import java.security.SecureRandom;
import java.util.Random;

public class BadPRNG {

    public void randomNum() {

        SecureRandom secureRandom = new SecureRandom();
        long randNum = 0;
        randNum = secureRandom.nextInt(1000);
        String ConverttoBits = Long.toBinaryString(randNum);
        String tempBits = ConverttoBits;

        int count_p0 = 0;
        int count_p1 = 0;

        for (int i = 0; i < ConverttoBits.length(); i++) {

            if (ConverttoBits.charAt(i) == '0') {
                count_p0 += 1;
            } else {
                count_p1 += 1;
            }
        }
        System.out.println("Random bits: " + ConverttoBits);
        System.out.println("p0: " + count_p0);
        System.out.println("p1: " + count_p1);

        int randomBitstobechanged = 0;
        if ((count_p0 + count_p1) % 2 == 0) {
            if (count_p0 > count_p1) {
                randomBitstobechanged = (count_p0 - count_p1) / 2;
                StringBuilder tempbits = new StringBuilder(tempBits);
                for (int j = 0; j < ConverttoBits.length(); j++) {
                    if (randomBitstobechanged > 0 & tempBits.charAt(j) == '0') {
                        tempbits.setCharAt(j, '1');
                        randomBitstobechanged -= 1;
                    }
                }
                System.out.print("Unbaised random bits: ");
                System.out.println(tempbits);
            } else {
                randomBitstobechanged = (count_p1 - count_p0) / 2;
                StringBuilder tempbits = new StringBuilder(tempBits);
                for (int k = 0; k < ConverttoBits.length(); k++) {
                    if (randomBitstobechanged > 0 & tempBits.charAt(k) == '1') {
                        tempbits.setCharAt(k, '0');
                        randomBitstobechanged -= 1;
                    }
                }
                System.out.print("Unbaised random bits: ");
                System.out.println(tempbits);
            }
        }
        else{
            StringBuilder tempbits = new StringBuilder(tempBits);
            if (count_p0 > count_p1) {
                tempbits.insert(0,"1");
                randomBitstobechanged = (count_p0 - (count_p1 + 1)) / 2;
                for (int j = 0; j < ConverttoBits.length(); j++) {
                    if (randomBitstobechanged > 0 & tempBits.charAt(j) == '0') {
                        tempbits.setCharAt(j, '1');
                        randomBitstobechanged -= 1;
                    }
                }
                System.out.print("Unbaised random bits: ");
                System.out.println(tempbits);
            }
            else {
                tempbits.insert(0,"0");
                randomBitstobechanged = (count_p1 - (count_p0 + 1)) / 2;
                for (int k = 0; k < ConverttoBits.length(); k++) {
                    if (randomBitstobechanged > 0 & tempBits.charAt(k) == '1') {
                        tempbits.setCharAt(k, '0');
                        randomBitstobechanged -= 1;
                    }
                }
                System.out.print("Unbaised random bits: ");
                System.out.println(tempbits);
            }
        }
    }
}
















