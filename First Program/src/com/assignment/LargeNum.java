package com.assignment;

import java.util.Scanner;

public class LargeNum {

    public static void main(String[] args){

//        5. Take 2 numbers as input and print the largest number.

        System.out.println("Find Large Number");
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int a = num.nextInt();
        System.out.print("Enter Num2: ");
        int b = num.nextInt();

        if(a>b){
            System.out.println("Large Num is: "+a);
        }
        else if(b>a){
            System.out.println("Large Num is: "+b);
        }
        else {
            System.out.println("Both are Equal");
        }
    }
}
