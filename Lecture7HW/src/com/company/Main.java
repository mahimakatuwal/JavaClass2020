package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo(123, "Mahima");

        encapsulationDemo.setName("Manuja");
        System.out.println(encapsulationDemo.getName());

        encapsulationDemo.setStudentID(456);
        System.out.println(encapsulationDemo.getStudentID());
    }
}
