package assignments;

import java.util.Scanner;

public class SumOfTwoNums {
    public static void main(String[] args){

//        4. [Write a program to print the sum of two numbers entered by user by defining your own method.]
//        (https://code4coding.com/addition-of-two-numbers-in-java-using-method/)

        Scanner in = new Scanner(System.in);
        System.out.println("Find Sum of Two Numbers");
        System.out.print("Enter Number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = in.nextInt();

        System.out.print("Sum of two numbers is: "+ sum(num1,num2));
    }
    static int sum(int a, int b){
        return a+b;
    }
}
