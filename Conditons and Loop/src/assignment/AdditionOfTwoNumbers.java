package assignment;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args){

//         Addition Of Two Numbers

        Scanner input = new Scanner(System.in);
        System.out.println("Sum of two Numbers");
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Sum of numbers is: "+ (num1+num2));
    }
}
