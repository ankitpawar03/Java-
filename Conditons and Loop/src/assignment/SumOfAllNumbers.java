package assignment;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args){

    // Take integer inputs till the user enters 0 and print the sum of all numbers
    //(HINT: while loop)


        int sum = 0;
        System.out.println("Enter Numbers to find Sum");
        System.out.println("Enter 0 to calculate");

        while(true){

            Scanner input = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = input.nextInt();

            if(num == 0){
                System.out.print("Sum of all numbers is: "+sum);
                return;
            }else{
                sum = num+sum;
            }
        }
    }
}
