package assignments;

import java.util.Scanner;

public class CAofCircle {

    public static void main(String[] args) {

//        6. [Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.]
//        (https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/)

        Scanner in = new Scanner(System.in);
        System.out.println("Find Circumference and Area of Circle");
        System.out.print("Enter Radius of Circle : ");
        double num = in.nextDouble();

        double area = area(num);
        System.out.println("Area of Circle is : "+area);

        double circum = cir(num);
        System.out.print("Circumference of Circle is : "+ circum);
    }
    static double area(double radius){

        double ans = (3.14159265359*radius*radius);
        return ans;
    }
    static double cir(double radius){

        double ans = (2*3.14159265359*radius);
        return ans;
    }
}
