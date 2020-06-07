package com.company;

import java.util.Scanner;

public class Q1 {
    int upperlimit;
    int lowerlimit;

    public Q1(){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        lowerlimit = scnr.nextInt();
        System.out.print("Enter upper limit: ");
        upperlimit = scnr.nextInt();
    }

    public void printLimits(){
        for(int i = lowerlimit; i<= upperlimit; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
