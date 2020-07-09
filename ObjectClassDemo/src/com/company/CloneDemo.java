package com.company;

public class CloneDemo implements Cloneable {

    int rollNum;
    String name;

    public CloneDemo(int rollNum, String name) {
        this.rollNum = rollNum;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


}
