package assignment;

import java.util.Scanner;

public class AreaOfParallelogram {

    public static void main(String[] args){

//        CALCULATING AREA OF PARALLELOGRAM

        Scanner input = new Scanner(System.in);
        System.out.println("CALCULATING AREA OF PARALLELOGRAM");
        System.out.print("Enter value of base: ");
        double base = input.nextDouble();
        System.out.print("Enter value of height: ");
        double height = input.nextDouble();

        System.out.print("Area of Parallelogram is: "+(base*height));
    }
}
