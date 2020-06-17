package com.company;

import java.util.Scanner;

public class SumofRange implements Numbers {

    @Override
    public void rangeOfNumber() {
        Scanner scnr = new Scanner(System.in);
        System.out.print("\nEnter lower limit: ");
        int num1 = scnr.nextInt();
        System.out.print("Enter upper limit: ");
        int num2 = scnr.nextInt();

        int sum = 0;
        for (int i = num1; i <= num2; i++){
            sum += i;
        }
        System.out.println("The sum is: "+ sum);
    }
}
