package assignment;

import java.util.Scanner;

public class AreaOdTriangle {
    public static void main(String[] args){

//        Find Area Of Triangle if base and height is given

        System.out.println("Find area of Triangle");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base value: ");
        double base = in.nextInt();
        System.out.print("Enter height value: ");
        double height = in.nextInt();

        double area = (base*height)/2;

        System.out.println("Area is: "+area);
    }
}
