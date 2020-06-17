package com.company;

import java.util.Scanner;

public class SecondsToHours implements Numbers {

    @Override
    public void rangeOfNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n--CONVERT SECONDS INTO HOURS, MINUTES AND SECONDS--");
        System.out.print("Enter number of seconds you want to convert: ");
        double sec = scan.nextDouble();

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
