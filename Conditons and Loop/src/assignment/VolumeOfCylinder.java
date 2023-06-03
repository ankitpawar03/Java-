package assignment;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args){

//        Calculating Volume Of Cylinder

        double pi = 3.14159265359;

        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Volume Of Cylinder");
        System.out.print("Enter Radius value of Cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter Height value of Cylinder: ");
        double height = input.nextDouble();

        System.out.print("Volume of Cylinder is: "+ (pi*radius*radius*height));
    }
}
