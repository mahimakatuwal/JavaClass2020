package com.company;

public class Main {

    public static void main(String[] args) {
	    int [] myArray = {2, 4, 69, 56, 4, 6, 70, 10, 78, 88};
        int max = myArray[0];
        int min = myArray[0];
	    for(int i = 0; i < myArray.length; i++) {
                if (myArray[i] > max){
                    max = myArray[i];
                }
                else if (myArray[i] < min){
                    min = myArray[i];
                }
            }

        System.out.println("The largest number in the array is: " + max );
        System.out.println("The smallest number in the array is: " + min);

    }
}
