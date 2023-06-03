package assignment;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {

    public static void main(String[] args){

//        Calculate Total Surface Area Of Cube

        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Total Surface Area of Cube");
        System.out.print("Enter Side Value of Cube: ");
        double side = input.nextDouble();

        System.out.print("Total Surface Area of Cube is: "+(6*side*side)+" feet square");
    }
}
