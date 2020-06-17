package com.company;

import java.util.Scanner;

public class MultiplicationTable implements Numbers {

    @Override
    public void rangeOfNumber() {
        Scanner scnr = new Scanner(System.in);
        int i;
        System.out.print("\nEnter a positive integer: ");
        i = scnr.nextInt();

        if (i > 0){
            for(int j = 1; j < 11; j++){
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
        else {
            System.out.println("Invalid, enter a positive integer!");
        }
    }
}
