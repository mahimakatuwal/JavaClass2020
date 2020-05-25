package com.company;

public class Main {

    public static void main(String[] args) {
        // 1. AmazonOrder
        AmazonOrder orderDetails = new AmazonOrder(12, 10);
        orderDetails.instVar();
        orderDetails.shipping();
        System.out.println(orderDetails.earnPts());
        System.out.println(orderDetails.cashBack());

        // 2. Sum of two numbers.
        FindSum add2 = new FindSum(15,20);
        add2.add();

        // 3. Multiplication table
        FindProduct product2 = new FindProduct();
        product2.multiply();

        //4. Prime Number.
        FindPrimeNumber primeNumber2 = new FindPrimeNumber();
        primeNumber2.detPrime();

    }
}
