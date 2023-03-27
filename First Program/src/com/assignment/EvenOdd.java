package com.assignment;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args){

//        1. Write a program to print whether a number is even or odd, also take
//        input from the user.

        System.out.println("Check Number Even or Odd");
        System.out.print("Enter Number: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        if(num%2==0){
            System.out.println("It's Even Number");
        }
        else{
            System.out.println("It's Odd Number");
        }
    }
}
