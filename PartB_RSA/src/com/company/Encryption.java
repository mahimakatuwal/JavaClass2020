package com.company;

import java.math.BigInteger;

public class Encryption {

    public void getCiphertext(){
        int n = 923;
        int e = 37;
        int m = 23;

        System.out.println("\n------------------ PART B:Q1 ---------------------");

        BigInteger Encryp = BigInteger.valueOf(m).modPow(BigInteger.valueOf(e), BigInteger.valueOf(n));

        System.out.println("The cipher text after encryption is: "+ Encryp);

    }
}
