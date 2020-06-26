package com.company;

public class Main {

    public static void main(String[] args) {

        ModeOfAction modeOfAction = new ModeOfAction();

        modeOfAction.allAction(new PrintNum());
        modeOfAction.allAction(new ReverseNum());

    }
}
