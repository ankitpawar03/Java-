package assignment;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args){

//        Calculating Volume Of Sphere

        double pi = 3.14159265359;

        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Volume Of Sphere");
        System.out.print("Enter Radius of Sphere: ");
        double radius = input.nextDouble();

        System.out.print("Volume of Sphere is: "+ (pi*radius*radius*radius*1.3333333));
    }
}
