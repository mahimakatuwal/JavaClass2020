package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class Main {

    public static void main(String[] args){

        ChildBank childbank = new ChildBank("Mahima", 24, 15987, 5000);
        ChildBank childBank1 = new ChildBank("Diptika", 23, 45697, 5000);
        ChildBank childBank2 = new ChildBank("Shambika", 27, 78894, 10000);
        ChildBank childBank3 = new ChildBank("Abhipsa", 30, 78954, 2000);

        List<ChildBank> childBankList = new ArrayList<>();
        childBankList.add(childbank);
        childBankList.add(childBank1);
        childBankList.add(childBank2);
        childBankList.add(childBank3);


        Collections.sort(childBankList); // sort array by overriding compareTo

        Collections.sort(childBankList, new sortbyAge());  //9. Sort array based on age using comparator
        Collections.sort(childBankList, new sortbyName()); //10. Sort array based on name using comparator

        for(Object obj: childBankList){
            System.out.println(obj);
        }

        //Collections.sort(childBankList);

    }
}
