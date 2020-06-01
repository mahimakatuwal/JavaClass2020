package com.company;

import java.util.Scanner;

public class ConvertSeconds {
    double sec;

    public ConvertSeconds(){
        this.sec = sec;
    }

    public void minutes(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("\n--CONVERT SECONDS INTO MINUTES AND SECONDS--");
        System.out.print("Enter number of seconds you want to convert: ");
        sec = scnr.nextDouble();

        double min = 0;
        double seconds = 0;

        min = sec / 60;
        seconds = sec % 60;

        String string2 = String.format("%.0f", seconds);
        String string3 = String.format("%.0f", sec);

        System.out.println( string3 + " seconds is " + (int)(min) + " minutes and "+ string2 + " seconds.");
    }

    public void hours(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n--CONVERT SECONDS INTO HOURS, MINUTES AND SECONDS--");
        System.out.print("Enter number of seconds you want to convert: ");
        sec = scan.nextDouble();

        double hr = 0;
        double mins = 0;
        double second = 0;

        hr = sec / 3600;
        mins = (sec / 60) % 60;
        second = sec % 60;

        String str3 = String.format("%.0f", second);
        String str4 = String.format("%.0f", sec);

        System.out.println(str4 + " seconds is " + (int)(hr) + " hours " + (int)(mins) + " minutes "+ str3 + " seconds.");
    }
}
