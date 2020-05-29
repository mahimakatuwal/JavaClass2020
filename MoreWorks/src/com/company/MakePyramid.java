package com.company;

public class MakePyramid {
    int a;

    public MakePyramid(int a){
        this.a = a;

    }

    public void myStraightPyramid(){
        System.out.println();
        for(int i = 1; i <= a; i++){
            for(int j = 1; j<= 7; j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
    public void myleftPyramid(){
        System.out.println("\n");
        for(int i = 1; i <= a; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void myrightPyramid(){
        System.out.println();
        for(int i = 1; i<=a; i++){
            for(int j = a-1; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void myPyramid(){
        System.out.println();
        for(int i = 1; i<=a; i++){
            for(int j = a-1; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public void myNumPyramid(){
        System.out.println();

        for(int i = 1; i <= a; i++){
            for(int j = a -1; j >= i; j-- ){
                System.out.print(" ");

            }
            for(int k = 1; k <= i; k++){
                System.out.print(" "+ i);

            }
            System.out.print("\n");
        }
    }

    public void myIncPyramid(){
        System.out.println();

        for(int i = 1; i <= a; i++){
            for(int j = a -1; j >= i; j-- ){
                System.out.print(" ");

            }
            int m = 1;
            for(int k = 1; k <= i; k++){
                System.out.print(" "+ m++ + " 1");

            }
            System.out.print("\n");
        }

    }

}
