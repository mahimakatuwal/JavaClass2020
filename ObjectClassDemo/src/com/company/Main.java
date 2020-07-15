package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        myClass1 myclass1 = new myClass1(11, "A");
        myClass1 myclass2 = new myClass1(11,"A");

        System.out.println(myclass1);
        System.out.println(myclass1.hashCode());

        System.out.println(myclass1.equals(myclass2));

        Class c = myclass2.getClass();
        System.out.println("Class of object myclass2 is: " + c.getName());

        System.out.println(myclass2.hashCode());

        myclass2 = null;
        System.gc();

        System.out.println("end");

        CloneDemo clonedemo = new CloneDemo(11, "Mahima");
        CloneDemo clonedemo2 = (CloneDemo) clonedemo.clone(); //typecasting
        clonedemo2.rollNum = 13;
        clonedemo2.name = "Manuja";

        System.out.println(clonedemo.rollNum + ", " + clonedemo.name);

        System.out.println(clonedemo2.rollNum + ", " + clonedemo2.name);

    }

}
