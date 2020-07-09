package com.company;

import java.util.Objects;

public class myClass1{

    int rollNum;
    String name;

    public myClass1(int rollNum, String name) {
        this.rollNum = rollNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        myClass1 myClass1 = (myClass1) o;
        return Objects.equals(rollNum, myClass1.rollNum);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString(){
        return "Class name: " + getClass().getName() + " has hashcode: " + Integer.toHexString(hashCode());
    }


}
