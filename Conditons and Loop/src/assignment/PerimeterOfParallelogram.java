package assignment;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args){

//        Calculating Perimeter Of Parallelogram

        Scanner input = new Scanner(System.in);
        System.out.println("Calculating Perimeter Of Parallelogram");
        System.out.print("Enter base of Parallelogram: ");
        double base = input.nextDouble();
        System.out.print("Enter side of Parallelogram: ");
        double side = input.nextDouble();

        System.out.print("Perimeter of Parallelogram is: "+(2*(base+side)));
    }
}
