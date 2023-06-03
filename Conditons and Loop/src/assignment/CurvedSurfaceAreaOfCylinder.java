package assignment;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {

    public static void main(String[] args){

//        Calculate Curved Surface Area Of Cylinder

        double pi = 3.14159265359;

        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Curved Surface Area Of Cylinder");
        System.out.print("Enter Radius of Cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter Height of Cylinder: ");
        double height = input.nextDouble();

        System.out.print("CSA of Cylinder is: "+(2*pi*radius*height));
    }
}
