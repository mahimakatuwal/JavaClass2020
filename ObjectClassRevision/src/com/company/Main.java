package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        ChildBank childbank = new ChildBank("Mahima", 24, 15987, 5000);
        ChildBank childBank1 = new ChildBank("Diptika", 23, 45697, 5000);
        ChildBank childBank2 = new ChildBank("Shambika", 27, 78894, 10000);
        ChildBank childBank3 = new ChildBank("Abhipsa", 20, 78954, 2000);

        System.out.println(childbank.toString());
        System.out.println(childBank1.toString());
        System.out.println(childBank2.toString());
        System.out.println(childBank3.toString());


        ChildBank cloneChildBank = (ChildBank) childbank.clone();
        cloneChildBank.name = "Manuja";
        cloneChildBank.age = 26;

        System.out.println("Cloned Name: " + cloneChildBank.name + " Cloned Age: " + cloneChildBank.age);

        System.out.println(childbank.equals(childBank1));



    }
}
