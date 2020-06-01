package com.company;

public class FindOdd {

    public void oddnum(){
        System.out.println("\n--ODD NUMBERS--");
        for(int i = 1; i <= 100; i++){
            if((i%2) != 0){
                System.out.print(i + " ");
            }
        }
    }

    public void multiplication(){
        System.out.println("\n--MULTIPLICATION TABLE--");
        for (int i = 1; i <= 5; i++){
            for(int j = 1; j < 11; j++){
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println();
        }

    }

    public void skip(){
        System.out.println("\n--SKIP 7 AND 8--");
        for(int i = 1; i < 11; i++){
            if(i != 7 && i != 8) {
                System.out.print(i + " ");
            }
        }
    }
}
