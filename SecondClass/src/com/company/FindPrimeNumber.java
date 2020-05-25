package com.company;

import java.util.Scanner;

public class FindPrimeNumber {
    int primeNum;

    public FindPrimeNumber(){
        Scanner scnr = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a positive number: ");
        primeNum = scnr.nextInt();
    }

    public void detPrime(){
        boolean isItPrime = true;

        for (int i = 2; i < primeNum; i++) {
            if (primeNum % i == 0)
                isItPrime = false;
        }

        if (isItPrime && primeNum >= 2) {
            System.out.println(primeNum + " is a prime number!!");

        } else if (!isItPrime && primeNum >= 2) {
            System.out.println(primeNum + " is not a prime number.:(");
        } else {
            System.out.println("Invalid! Enter a number greater than 1");
        }

    }
}
