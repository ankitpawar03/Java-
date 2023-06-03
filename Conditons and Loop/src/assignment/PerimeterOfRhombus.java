package assignment;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args){

//        Calculating Perimeter Of Rhombus

        Scanner input = new Scanner(System.in);
        System.out.println("Calculating Perimeter Of Rhombus");
        System.out.print("Enter a side value of Rhombus: ");
        double side = input.nextDouble();

        System.out.print("Perimeter of Rhombus is: "+(4*side));
    }
}
