package assignment;

import java.util.Scanner;

public class PerimeterOfCircle {

    public static void main(String[] args){

//        CALCULATING PERIMETER OF CIRCLE
        double pi = 3.14159265359;

        Scanner input = new Scanner(System.in);
        System.out.println("CALCULATING PERIMETER OF CIRCLE");
        System.out.print("Enter Radius of Circle: ");
        double radius = input.nextDouble();

        System.out.print("Perimeter of Circle: "+2*pi*radius);
    }
}
