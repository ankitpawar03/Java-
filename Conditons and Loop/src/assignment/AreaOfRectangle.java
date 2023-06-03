package assignment;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){

//      Area Of Rectangle Program
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Area of Rectangle");
        System.out.print("Enter width: ");
        double width = input.nextDouble();
        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.println(width*length);
    }
}
