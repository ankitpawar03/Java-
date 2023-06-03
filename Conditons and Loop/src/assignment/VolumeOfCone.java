package assignment;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args){

//        Calculating Volume Of Cone

        double pi = 3.14159265359;
        Scanner input = new Scanner(System.in);
        System.out.println("Calculating Volume Of Cone");
        System.out.print("Enter Radius Value of Cone: ");
        double radius = input.nextDouble();
        System.out.print("Enter Height Value of Cone: ");
        double height = input.nextDouble();

        System.out.print("Volume of Cone is: "+(pi*(radius*radius)*(height/3)));
    }
}
