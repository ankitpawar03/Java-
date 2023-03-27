package com.assignment;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args){

//        8. To find out whether the given String is Palindrome or not.

        System.out.println("Enter string to check palindrom or not:");
        Scanner input = new Scanner(System.in);
        String str1 = input.next();

        String str2 = "";

        for (int i=str1.length()-1; i>=0; i--){

            str2 += str1.charAt(i);
        }
        if (str2.toLowerCase().equals(str1.toLowerCase())){
            System.out.println("It is a Palindrom");
        }
        else {
            System.out.println("It is not a Palindrom");
        }
    }
}
