package assignment;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args){

//        Calculating Perimeter Of Square

        Scanner input = new Scanner(System.in);
        System.out.println("Calculating Perimeter Of Square");
        System.out.print("Enter a side value of a square: ");
        double side = input.nextDouble();

        System.out.println("Perimeter of Square is: "+(4*side));
    }
}
