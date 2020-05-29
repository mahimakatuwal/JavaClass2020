package com.company;

import java.util.Scanner;

public class FindProduct {
    int num1;

    //creating a constructor
    public FindProduct(){
        Scanner scnr = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a number: ");
        num1 = scnr.nextInt();
    }

    //creating a method
    public void multiply(){
        System.out.println();
        System.out.println("The product of the number is:");
        for(int j = 1; j < 11; j++){
            System.out.println(num1 + " X " + j + " = " + num1 * j);
        }
    }
}
