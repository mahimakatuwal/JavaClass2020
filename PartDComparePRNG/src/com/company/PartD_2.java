package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class PartD_2 {
    
    public void myRandomNum() throws IOException {
        int randNum = 0;
        Calendar calendar = Calendar.getInstance();
        int timeMillisec = (int) calendar.getTimeInMillis();
        System.out.println(timeMillisec);
        String str = "";

        for(int i = 0; i < 100000; ++i){
            randNum = randNum + timeMillisec;
            String ConverttoBits = Long.toBinaryString(randNum);
            str = str + ConverttoBits;
        }

        File myOutputFile2 = new File("myrandomnum2.txt");
        FileOutputStream fos = new FileOutputStream(myOutputFile2);
        byte[] bytesArray2 = str.getBytes();
        fos.write(bytesArray2);

    }


}
