package com.company;

import java.util.Scanner;

public class Q6 {
    int num1;

    public Q6() {
        Scanner scnr = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        num1 = scnr.nextInt();

    }

    public void evenOdd(){
         if(num1 % 2 == 0){
             System.out.println("Your number is even!");

         } else{
             System.out.println("Your number is odd!");
         }
    }
}
