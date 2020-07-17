package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class SortString {
    public void sortstring() {
        String[] name = {"Mahima", "Abhipsa","Manuja","Diptika", "Bimala", "Shambika"};
        int sizeofarray = name.length;

        for(int i =0; i<sizeofarray-1; i++){
            for(int j = i+1; j<sizeofarray; j++){
                if(name[i].compareTo(name[j])>0){
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(name));

    }


}
