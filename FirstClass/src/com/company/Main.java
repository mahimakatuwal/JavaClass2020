package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//     Q10:
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        char choice;

        do{
            System.out.print("Enter first number: ");
            num1 = scnr.nextInt();

            System.out.print("Enter second number: ");
            num2 = scnr.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum of number: "+ sum);

            System.out.print("Do you wish to continue? Press y/n: ");
            choice = scnr.next().charAt(0);

            System.out.println();

        } while(choice == 'y' || choice == 'Y');



//     ##############################################

//     Q9:
//        Scanner scnr = new Scanner(System.in);
//        int num1;
//        System.out.print("Enter first number: ");
//        num1 = scnr.nextInt();
//        int num2;
//        System.out.print("Enter second number: ");
//        num2 = scnr.nextInt();
//
//        int hcf = 0;
//
//        for(int i = 1; i <= num1 || i <= num2; i++){
//            if(num1 % i == 0 && num2 % i == 0)
//                hcf = i;
//
//        }
//
//        System.out.println("HCF is: " + hcf);

//     ##############################################################################

//     Q8:
//        Scanner scnr = new Scanner(System.in);
//        int primeNum;
//        System.out.print("Enter a positive number: ");
//        primeNum = scnr.nextInt();
//
//        boolean isItPrime = true;
//
//        if (primeNum <= 1) {
//            System.out.println("Invalid, enter a positive number greater than 1.");
//            isItPrime = false;
//        }
//        else{
//            for(int i = 2; i <= primeNum / 2; i++){
//                if(primeNum % i == 0)
//                    isItPrime = false;
//            }
//
//        }
//
//        if(isItPrime){
//            System.out.println(primeNum + " is a prime number!!");
//
//        }
//        else{
//            System.out.println(primeNum + " is not a prime number.:(");
//        }

//    ########################################################

//     Q7:

//        Scanner scnr = new Scanner(System.in);
//        int num;
//        int even = 0;
//        int odd = 0;
//        System.out.println("Enter a number: ");
//        num = scnr.nextInt();
//
//        for(int i = 1; i <= num; i++){
//            if (i % 2 == 0){
//                even += i;
//            }
//            else {
//                odd += i;
//            }
//        }
//        System.out.println("Sum of even numbers: " + even);
//        System.out.println("Sum of odd numbers: " + odd);


//    ######################################################

//     Q6:
//        Scanner scnr = new Scanner(System.in);
//        int num;
//        int revNum = 0;
//        System.out.print("Enter a number: ");
//        num = scnr.nextInt();
//
//        int temp = num;
//
//        while(temp > 0) {
//            int rem = temp % 10;
//            revNum = revNum * 10 + rem;
//            temp /= 10;
//        }
//        System.out.println("Reverse of " + num + " is " + revNum);

//      ##################################################

//      Q5:

//        Scanner scnr = new Scanner(System.in);
//        int num1;
//        System.out.print("Enter first number: ");
//        num1 = scnr.nextInt();
//
//        int num2;
//        System.out.print("Enter second number: ");
//        num2 = scnr.nextInt();
//
//        int num3 = 1;
//        for(int p = 1; p <= num2; p++){
//            num3 *= num1;
//        }
//        System.out.println(num3);

//      ##############################################################
//      Q4:
//        Scanner scnr = new Scanner(System.in);
//        int num;
//        System.out.print("Enter a number: ");
//        num = scnr.nextInt();
//
//        int f = 1;
//        for( int k = 1; k <= num; k++ ){
//            f *= k;
//        }
//        System.out.println("Factorial of " + num + " is " + f + ".");

//        ####################################################

//        Q3:

//        Scanner scnr = new Scanner(System.in);
//        int i;
//        System.out.print("Enter a positive integer: ");
//        i = scnr.nextInt();
//
//        if (i > 0){
//            for(int j = 1; j < 11; j++){
//                System.out.println(i + " X " + j + " = " + i * j);
//            }
//        }
//        else {
//            System.out.println("Invalid, enter a positive integer!");
//        }


//      #########################################################

//      Q2:

//        int j = 0;
//        for (int i = 1; i <11; i++){
//            j +=  i;
//
//            }
//        System.out.println(j);

//     #####################################

//      Q1:
//        for (int i = 1; i < 11; i++){
//            System.out.println(i);
//        }


        }

    }

