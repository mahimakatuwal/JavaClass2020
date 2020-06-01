package com.company;

import javax.sound.midi.Soundbank;

public class QN1 {

    public void print1137() {
        for (int i = 11; i <= 37; i++) {
            System.out.print(i + " ");
        }
    }

    public void add10(){
        int sum = 0;
        for(int i=1; i <=10; i++ ){
            sum += i;
        }
        System.out.println();
        System.out.println("\nThe sum of 1 through 10 is " + sum + ".");
    }

    public void ifelse(){
        boolean flag = false;

        if(!flag) {
            System.out.println("\nIt's a false statement!");
        }
        else{
            System.out.println("\nIt's a true statement");
        }
    }
}
