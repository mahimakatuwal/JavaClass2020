package com.company;

public class Main {

    public static void main(String[] args) {

        ModeOfAction modeofaction = new ModeOfAction();
        modeofaction.allAction(new PrintNum());
        modeofaction.allAction(new SecondsToHours());
        modeofaction.allAction(new SumofRange());
        modeofaction.allAction(new PrimeNum());
        modeofaction.allAction(new ReverseNum());
        modeofaction.allAction(new EvenOdd());
        modeofaction.allAction(new MultiplicationTable());


    }
}
