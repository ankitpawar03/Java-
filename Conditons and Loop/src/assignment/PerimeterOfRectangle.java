package assignment;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args){

//        Calculating Perimeter Of Rectangle

        Scanner input = new Scanner(System.in);
        System.out.println("Calculating Perimeter Of Rectangle");
        System.out.print("Enter Length of Rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter Width of Rectangle: ");
        double width = input.nextDouble();

        System.out.print("Perimeter of Rectangle is: "+ (2*(length+width)));

    }
}
