package com.company;

import java.math.BigInteger;

public class Decryption {

    public void getPlaintext(){
        int n = 923;
        int e = 37;
        int C = 148;

        int p = 71;
        int q = 13;
        int n1 = (p -1) * (q - 1);

        System.out.println("\n------------------ PART B:Q2 ---------------------");

        int d;
        BigInteger Decryp = new BigInteger("0");

        for (d = 1; d < n1; d++) {
            if ((e * d) % n1 == 1) {
                System.out.println("The private/secret key is: "+ d);
                break;
            }
        }

        Decryp = BigInteger.valueOf(C).modPow(BigInteger.valueOf(d), BigInteger.valueOf(n));
        System.out.println("The plain text after decryption is: " + Decryp);

    }
}
