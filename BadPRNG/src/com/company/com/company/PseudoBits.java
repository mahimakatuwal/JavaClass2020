package com.company;


import java.util.Arrays;

import java.util.Random;


public class PseudoBits {

    public void arrayRandom() {

        Random random = new Random();

        int[] randomBits = new int[10];
        int[] TempRandomBits = new int[10];
        int count_0 = 0;
        int count_1 = 0;

        System.out.print("Biased random bits : ");

        for (int i = 0; i < randomBits.length; i++) {

            randomBits[i] = random.nextInt(2);
            TempRandomBits[i] = randomBits[i];

            if (TempRandomBits[i] == 0) {
                count_0 += 1;
            } else {
                count_1 += 1;
            }

            int randomBitstobechanged = 0;
            if (count_0 > count_1) {
                randomBitstobechanged = (count_0 - count_1) / 2;
                for (int j = 0; j < i; j++) {
                    if (randomBitstobechanged > 0 & TempRandomBits[i] == 0) {
                        TempRandomBits[i] = 1;
                        randomBitstobechanged -= 1;
                    }
                }
            } else if (count_1 > count_0) {
                randomBitstobechanged = (count_1 - count_0) / 2;
                for (int k = 0; k < i; k++) {

                    if (randomBitstobechanged > 0 & TempRandomBits[i] == 1) {
                        TempRandomBits[i] = 0;
                        randomBitstobechanged -= 1;
                    }
                }
            } else {
                TempRandomBits[i] = randomBits[i];
            }
        }


        //System.out.println("}");
        System.out.println(Arrays.toString(randomBits));
        System.out.print("Unbiased random bits: ");
        System.out.println(Arrays.toString(TempRandomBits));
        System.out.println(count_0);
        System.out.println(count_1);


    }
}

