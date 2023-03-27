package com.assignment;

import java.util.Scanner;

public class Greetings {

    public static void main(String [] args){

//        2. Take name as input and print a greeting
//           message for that particular name.

        System.out.print("What is your name: ");
        Scanner word = new Scanner(System.in);
        String name = word.nextLine();

        System.out.println("Good Afternoon "+ name);
    }
}
