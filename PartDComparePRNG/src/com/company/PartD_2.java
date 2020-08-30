package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class PartD_2 {
    
    public void myRandomNum(){
        long randNum = 0;
        long num1 = 0;

        Calendar calendar = Calendar.getInstance();
        long timeMillisec = calendar.getTimeInMillis();

        for(int i = 0; i < 25; i++){
            timeMillisec = timeMillisec + num1;
            randNum = randNum + num1 + timeMillisec * timeMillisec;
            num1 = timeMillisec;
        }

        //System.out.println(randNum);
        String ConverttoBits = Long.toBinaryString(randNum);
        System.out.println("PRNG implemented: "+ConverttoBits);

    }


}
