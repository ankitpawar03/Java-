package com.assignment;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner n = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        double num1 = n.nextInt();
        System.out.print("Enter Operator: ");
        String o = n.next().trim();
        System.out.print("Enter Num2: ");
        double num2 = n.nextInt();

        double sum = 0;

        if (o.equals("+")){
            sum = num1 + num2;
        }
        if (o.equals("-")){
            sum = num1 - num2;
        }
        if (o.equals("*")){
            sum = num1 * num2;
        }
        if (o.equals("/")){
            sum = num1 / num2;
        }
        if (o.equals("%")){
            sum = num1 % num2;
        }
        System.out.println("Result: "+sum);
    }
}
