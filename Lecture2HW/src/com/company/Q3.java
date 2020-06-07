package com.company;

import java.util.Scanner;

public class Q3 {
    int num1;
    int num2;

    public Q3(){
        Scanner scnr = new Scanner(System.in);
        System.out.print("\nEnter lower limit: ");
        num1 = scnr.nextInt();
        System.out.print("Enter upper limit: ");
        num2 = scnr.nextInt();
    }

    public void sumoflimits(){
        int sum = 0;
        for (int i = num1; i <= num2; i++){
            sum += i;
        }
        System.out.println("The sum is: "+ sum);
    }
}
