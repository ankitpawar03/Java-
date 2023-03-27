package com.assignment;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){

//        7. To calculate Fibonacci Series up to n numbers.

        System.out.println("Find Fibonacci Number");
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = num.nextInt();
        int a = 0;
        int b = 1;

        int y = 2;

        while (x >= y){

            int temp = b;
            b = b + a;
            a = temp;
            y++;
        }
        if (x == 0){
            System.out.println(0);
        }else {
            System.out.println("Fibonacci Number: " + b);
        }
    }
}
