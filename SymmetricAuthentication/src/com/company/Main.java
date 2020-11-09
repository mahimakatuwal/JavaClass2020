package com.company;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
	// write your code here
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a symmetric Key: ");
        String symKey = scnr.next();

        System.out.print("Hey Alice, please enter a challenge: ");
        String C = scnr.next();

        String R = symKey + C + symKey;

        String secureHash = hash(R);
        System.out.println("Expected Response needed: " + secureHash);

        System.out.print("Hey Bob, please enter a response: ");
        String R_Bob = scnr.next();

        System.out.println("------------------------------------------------");

        if(R_Bob.equalsIgnoreCase(secureHash)){
            System.out.println("\t\tAuthentication Successful!");
        }
        else {
            System.out.println("\t\tAuthentication Failed!!");
        }
    }

    public static String hash(String h) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        byte[] bytes = md.digest(h.getBytes());

        // Convert byte array into signum representation
        BigInteger no = new BigInteger(1, bytes);

        // Convert message digest into hex value
        String hashtext = no.toString(16);
        
        return hashtext;
    }
}
