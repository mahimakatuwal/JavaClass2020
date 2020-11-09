package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Hey Bob! Please enter p: ");
        int p = scnr.nextInt();

        System.out.print("Hey Bob! Please enter q: ");
        int q = scnr.nextInt();

        System.out.print("Hey Bob! Please enter e: ");
        int e = scnr.nextInt();

        int n = p * q; //calculating n

        //displaying public key
        System.out.println("Bob's public key is: (" + n + ", " + e + ")");

        //Calculating d
        int n1 = (p -1) * (q - 1);
        int d;
        for (d = 1; d < n1; d++) {
            if ((e * d) % n1 == 1) {
                //displaying private key
                System.out.println("Bob's private/secret key is: "+ d);
                break;
            }
        }

        //Challenge
        System.out.print("Hey Alice! Please enter a challenge C: ");
        int C = scnr.nextInt();

        //Response
        BigInteger expected_R = decryption(C, d, n);
        System.out.println("Expected response: " + expected_R);
        System.out.print("Hey Bob! Please enter a response: ");
        BigInteger R = scnr.nextBigInteger();
        System.out.println("-------------------------------------------");

        //Comparing expected Response and Bob's response for verification
        if(expected_R.equals(R)){
            System.out.println("\t\tAuthentication Verified!");
        }
        else{
            System.out.println("\t\tAuthentication Failed!!");
        }
    }


    public static BigInteger decryption(int C, int d, int n){
        BigInteger decrypt = BigInteger.valueOf(C).modPow(BigInteger.valueOf(d), BigInteger.valueOf(n));
        return decrypt;
    }
}
