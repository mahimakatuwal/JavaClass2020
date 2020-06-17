package com.company;

import java.util.Scanner;

public class PrintNum implements Numbers {

    @Override
    public void rangeOfNumber() {

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lowerlimit = scnr.nextInt();
        System.out.print("Enter upper limit: ");
        int upperlimit = scnr.nextInt();

        for(int i = lowerlimit; i<= upperlimit; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
