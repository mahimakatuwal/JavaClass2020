package com.company;

public class ChildClass extends ParentClass {

    public ChildClass(int lowerlimit, int upperlimit){
        super(lowerlimit, upperlimit);

    }

    //Overides the method of parent class. It uses the same method name and parameter.
    public void printLimits(){
        int sum = 0;
        for(int i = lowerlimit; i<= upperlimit; i++){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nThe sum of the given numbers is: " + sum);
        System.out.println();
    }
}
