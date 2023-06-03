package assignment;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

    public static void main(String[] args){

//        CALCULATING AREA OF EQUILATERAL TRIANGLE

        Scanner input = new Scanner(System.in);
        System.out.println("CALCULATING AREA OF EQUILATERAL TRIANGLE");
        System.out.print("Enter value of any side of triangle: ");
        Double sideOfTriangle = input.nextDouble();

        System.out.print("Area of Equilateral Triangle :"+ (0.4325*(sideOfTriangle*sideOfTriangle)));
    }
}
