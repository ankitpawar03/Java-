package assignment;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args){

//        Calculate Volume Of Pyramid

        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Volume Of Pyramid");
        System.out.print("Enter Length value of Base: ");
        double length = input.nextDouble();
        System.out.print("Enter Width value Pyramid: ");
        double width = input.nextDouble();
        System.out.print("Enter Height value Pyramid: ");
        double height = input.nextDouble();

        System.out.print("Volume of Pyramid is: "+((length*width*height)/3));
    }
}
