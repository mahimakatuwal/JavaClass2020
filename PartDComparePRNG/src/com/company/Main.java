package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
       PartD_1 strongprng = new PartD_1();
        strongprng.genPRNG();
        PartD_2 partD2 = new PartD_2();
        partD2.myRandomNum();

    }
}
