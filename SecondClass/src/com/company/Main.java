package com.company;

public class Main {

    public static void main(String[] args) {
        // 1. AmazonOrder
        AmazonOrder orderDetails = new AmazonOrder(12, 10); //creating an object called orderDetails.
        orderDetails.instVar(); // calling instVar method using orderDetails object
        orderDetails.shipping(); // calling shipping method using orderDetails object
        System.out.println(orderDetails.earnPts()); //printing return method called earnPts
        System.out.println(orderDetails.cashBack()); //printing return method called cashBack

        // 2. Sum of two numbers.
        FindSum add2 = new FindSum(15,20);  //creating an object called add2
        add2.add(); //calling method called add using object add2.

        // 3. Multiplication table
        FindProduct product2 = new FindProduct(); // creating an object called product2
        product2.multiply();    // calling method called multiply

        //4. Prime Number.
        FindPrimeNumber primeNumber2 = new FindPrimeNumber(); // creating an object called primeNumber2
        primeNumber2.detPrime();    // calling method detPrime using primeNumber2

    }
}
