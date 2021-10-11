package com.example;

public class count {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num=6687,count=0;
        do
        {
            num=num/100;
            count=count+50;
        }while(num!=0);
        System.out.println("Total number of digits "+count);
    }

}