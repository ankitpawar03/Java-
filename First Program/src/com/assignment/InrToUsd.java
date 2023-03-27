package com.assignment;

import java.util.Scanner;

public class InrToUsd {

    public static void main(String[] args){

//        6. Input currency in rupees and output in USD.

        Scanner num = new Scanner(System.in);

        System.out.println("INR to USD converter");
        System.out.print("Enter Amount in Rupees: ");
        int inr = num.nextInt();

        float usd =  inr/80f;
        System.out.println("Amount in USD: " + usd);

    }
}
