package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

public class PartD_1 {

    public void genPRNG() throws IOException {
        SecureRandom secureRandom = new SecureRandom();
        int myrandombits = 0;
        String ConverttoBits = null;
        String RandBitString = "";
        for (int i = 1; i <= 1000000; ++i) {
                myrandombits = secureRandom.nextInt(2);
                ConverttoBits = Integer.toBinaryString(myrandombits);
                RandBitString = RandBitString + ConverttoBits;
        }
        File myOutputFile = new File("myrandomnum.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(myOutputFile);
        byte[] bytesArray = RandBitString.getBytes();
        fileOutputStream.write(bytesArray);

    }
}

