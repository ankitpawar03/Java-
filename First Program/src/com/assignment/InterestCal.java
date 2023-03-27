package com.assignment;

import java.util.Scanner;

public class InterestCal {
    public static void main(String[] args){

//        3. Write a program to input principal, time, and rate
//           (P, T, R) from the user and find Simple Interest.

        Scanner num = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        int principal = num.nextInt();
        System.out.print("Enter Time in Year: ");
        int time = num.nextInt();
        System.out.print("Enter Interest Rate: ");
        int rate = num.nextInt();

        float interest = (principal*time*rate)/100;

        System.out.println("Interest is: " + interest + " Rupees");
    }
}