package com.company;

import java.util.Scanner;

public class ReverseNum implements Numbers{

    @Override
    public void rangeOfNumber() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("\n--FIND REVERSE NUMBER--");
        System.out.print("Enter a number: ");
        int num = scnr.nextInt();

        int revNum = 0;

        int temp = num;

        while (temp > 0) {
            int rem = temp % 10;
            revNum = revNum * 10 + rem;
            temp /= 10;
        }
        System.out.println("Reverse of " + num + " is " + revNum);
    }
}
