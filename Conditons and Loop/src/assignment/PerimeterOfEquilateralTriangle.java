package assignment;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args){

//        Calculating Perimeter Of Equilateral Triangle

        Scanner input = new Scanner(System.in);
        System.out.println("Calculating Perimeter Of Equilateral Triangle");
        System.out.print("Enter a side value of Triangle: ");
        double sideOfTriangle = input.nextDouble();

        System.out.print("Perimeter of E Triangle is: "+ (3*sideOfTriangle));
    }
}
