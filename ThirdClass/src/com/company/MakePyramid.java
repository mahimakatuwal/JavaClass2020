package com.company;

public class MakePyramid {
    int a;

    public MakePyramid(int a){
        this.a = a;

    }
    public void myPyramid(){
        System.out.println("\n--MY PYRAMID--");
        for(int i = 1; i <= a; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
