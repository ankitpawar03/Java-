package assignment;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args){

//        Calculating Volume Of Prism

        Scanner input = new Scanner(System.in);
        System.out.println("Calculating Volume Of Prism");
        System.out.print("Enter base of triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = input.nextDouble();
        System.out.print("Enter length of prism: ");
        double length = input.nextDouble();

        System.out.print("Volume of Prism is: "+0.5*base*height*length+" CM3");
    }
}
