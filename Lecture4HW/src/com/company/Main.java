package com.company;

public class Main {

    public static void main(String[] args) {

        ChildClass objectA = new ChildClass(4,10);
        objectA.printLimits();

        //Calling parent class's method using child class's object
        objectA.multiply();
    }
}
