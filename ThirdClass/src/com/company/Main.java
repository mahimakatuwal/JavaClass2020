package com.company;

public class Main {

    public static void main(String[] args) {
        QN1 print = new QN1();
        print.print1137();
        print.add10();
        print.ifelse();

        ConvertSeconds con = new ConvertSeconds();
        con.minutes();
        con.hours();

        FindPrime prime = new FindPrime();
        prime.detPrime();

        FindReverse rev = new FindReverse();
        rev.revNumber();

        MakePyramid pyr = new MakePyramid(7);
        pyr.myPyramid();

        FindOdd odd = new FindOdd();
        odd.oddnum();
        odd.multiplication();
        odd.skip();
    }
}
