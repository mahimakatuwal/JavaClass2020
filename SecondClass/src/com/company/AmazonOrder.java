package com.company;

public class AmazonOrder {
    int itemNum;
    int price;

    //creating a constructor
    public AmazonOrder(int item, int price){
        this.itemNum = item;
        this.price = price;

    }

    public void instVar(){
        System.out.println("Your item number is "+ itemNum);
        System.out.println("Your price is $"+price);
    }

    public void shipping(){
        if(price > 50){
            System.out.println("Yay! You are eligible for free shipping!");
        } else {
            System.out.println("Add some more item to get free shipping!");
        }
    }

    public String earnPts(){
        if(price > 100){
            return "Hurray! You've earned points!";
        } else {
            return "Sorry, you didn't earn any points.";
        }
    }

    public int cashBack(){
        if(price > 100){
            return 10;
        }else {
            return 0;
        }
    }
}
