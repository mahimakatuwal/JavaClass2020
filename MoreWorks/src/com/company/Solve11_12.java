package com.company;

import java.util.Scanner;

public class Solve11_12 {
    int num;

    public Solve11_12(){

        System.out.println();

    }

    public void choice(){
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        char chr;
        do{
            Scanner scnr = new Scanner(System.in);
            System.out.print("Enter a number: ");
            num = scnr.nextInt();

            if (num > 0){
                posCount += 1;

            }
            else if (num < 0){
                negCount += 1;

            }
            else{
                zeroCount += 1;

            }

            System.out.println("Do you want to continue? y/n");
            chr = scnr.next().charAt(0);

        } while(chr == 'y' || chr == 'Y');

        System.out.println();
        System.out.println("There are " + posCount + " positive numbers");
        System.out.println("There are "+ negCount + " negative numbers.");
        System.out.println("There are "+ zeroCount + " zeros.");

    }

    public void solve12(){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char chr;
        do{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number: ");
            num = scan.nextInt();


            if(num > max){
                max = num;

            }
            else if(num < min){
                min = num;
            }

            System.out.println("Do you wish to continue? y/n");
            chr = scan.next().charAt(0);

        } while( chr == 'y' || chr == 'Y');

        System.out.println();
        System.out.println("The greatest number is " + max);
        System.out.println("The lowest number is " + min);
    }
}
