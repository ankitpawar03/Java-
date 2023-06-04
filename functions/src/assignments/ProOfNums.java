package assignments;

import java.util.Scanner;

public class ProOfNums {
    public static void main(String[] args){

//        5. [Define a method that returns the product of two numbers entered by user.]
//        (https://code4coding.com/java-program-to-multiply-two-numbers-using-method/)

        Scanner in = new Scanner(System.in);
        System.out.println("Find Product of Two Numbers");
        System.out.print("Enter Number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = in.nextInt();

        System.out.print("Product of two numbers is: "+product(num1, num2));
    }
    static int product(int a, int b){
        return a*b;
    }
}
