package com.assignment;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args){

//        9. To find Armstrong Number between two given number.

        System.out.println("Find armstrong number between two numbers: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();


        for(int i=num1; i<=num2; i++){

            int x = i;
            int original =  x;
            int sum = 0;

            while (x>0){
                int a = x%10;
                x = x / 10;
                sum += a*a*a;
            }
            if(sum==original){
                System.out.println(sum);
            }
        }
    }
}
