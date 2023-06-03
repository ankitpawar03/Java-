package assignment;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args){

//        Area Of Circle by inputting diameter with Java Program

        Scanner in = new Scanner(System.in);

        double dia = in.nextInt();
        double pi = 3.14159265359;

//        area of circle if diameter is given: A = pi*(d*d)/4

        double area = pi*(dia*dia);

        System.out.println(area);
    }
}
