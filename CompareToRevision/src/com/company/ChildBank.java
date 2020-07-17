package com.company;

import java.util.Objects;

public class ChildBank extends ParentBank implements Comparable<ChildBank>{
    int AccNum;
    double balance;

    public ChildBank(String name, int age, int AccNum, double balance) {
        super(name, age);
        this.AccNum = AccNum;
        this.balance = balance;
    }

    public int getAccNum() {
        return AccNum;
    }

    public void setAccNum(int accNum) {
        AccNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ChildBank{" +
                "AccNum= " + AccNum +
                ", Balance= " + balance +
                ", Name= " + name +
                ", Age= " + age +
                '}';
    }

      // Sort the array based on age (override compareTo )
//    @Override
//    public int compareTo(ChildBank o) {
//        if(this.getAge() - o.getAge() > 0){
//            return 1;
//        }
//        else return -1;
//    }

    //Sort the array based on name (Override compareTo )
    public int compareTo(ChildBank o) {
        if(this.getName().compareTo(o.getName()) > 0){
            return 1;
        }
        else return -1;
    }

}
