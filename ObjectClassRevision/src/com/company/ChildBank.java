package com.company;

import java.util.Objects;

public class ChildBank extends ParentBank implements Cloneable {

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

    public String toString(){
        return "Name: " + getName() + " Age: " + getAge();

    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public boolean equals(Object o){
        ChildBank childBank = (ChildBank) o;
        return Objects.equals(getBalance(), childBank.getBalance());
    }


}
