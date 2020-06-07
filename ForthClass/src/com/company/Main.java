package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {7, 6, 4, 8, 2, 3};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));


    }

}
