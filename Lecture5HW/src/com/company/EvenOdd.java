package com.company;

import java.util.Scanner;

public class EvenOdd implements Numbers {

    @Override
    public void rangeOfNumber() {
        Scanner scnr = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int num1 = scnr.nextInt();

        if(num1 % 2 == 0){
            System.out.println("Your number is even!");

        } else{
            System.out.println("Your number is odd!");
        }
    }
}
