package com.company;

public class Main {

    public static void main(String[] args) {

        MakePyramid mkPy = new MakePyramid(5);
        mkPy.myStraightPyramid();
        mkPy.myleftPyramid();
        mkPy.myrightPyramid();
        mkPy.myPyramid();
        mkPy.myNumPyramid();
        mkPy.myIncPyramid();

        Solve11_12 solve = new Solve11_12();
        solve.choice();
        solve.solve12();
    }
}
