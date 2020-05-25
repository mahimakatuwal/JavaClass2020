package com.company;

public class FindSum {
    int num1;
    int num2;
    int sum;
    public FindSum(int i, int j){
        this.num1 = i;
        this.num2 = j;
    }

    public void add(){
        sum = num1 + num2;
        System.out.println();
        System.out.println("The sum of num1 and num2 is "+ sum + ".");
    }
}
