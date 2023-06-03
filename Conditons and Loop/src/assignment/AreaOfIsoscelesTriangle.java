package assignment;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args){

//        CALCULATING AREA OF ISOSCELES TRIANGLE

        Scanner input = new Scanner(System.in);
        System.out.println("CALCULATING AREA OF ISOSCELES TRIANGLE");
        System.out.print("Enter base value: ");
        double base = input.nextDouble();
        System.out.print("Enter hieght value: ");
        double hieght = input.nextDouble();

        System.out.println((base*hieght)/2);

    }
}
