package assignment;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args){

//        CALCULATING Area Of Rhombus

        Scanner input = new Scanner(System.in);
        System.out.println("CALCULATING AREA OF RHOMBUS");
        System.out.print("Enter value of diagonal 1: ");
        double diagonal1 = input.nextDouble();
        System.out.print("Enter value of diagonal 2: ");
        double diagonal2 = input.nextDouble();

        System.out.println("Area of Rhombus is: "+(diagonal1*diagonal2)/2);
    }
}
