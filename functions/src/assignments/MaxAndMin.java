package assignments;

import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args){

//        1. [Define two methods to print the maximum and the minimum
//        number respectively among three numbers entered by the user.]
//        (https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)

        Scanner in = new Scanner(System.in);
        System.out.println("Find largest and minimum number in three numbers");
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter third number: ");
        int num3 = in.nextInt();

        System.out.println();

        System.out.println("Maximum number is: "+max(num1, num2, num3));

        System.out.println("Minimum number is: "+min(num1, num2, num3));

//        System.out.print(ans);
    }
    static int max(int a, int b, int c){

        int large = a;

        if (b>a){
            large = b;
        }
        if(c>b){
            large = c;
        }
        return large;
    }
    static int min(int a, int b, int c){

        int small = a;

        if (b<a){
            small = b;
        }
        if(c<b){
            small = c;
        }
        return small;
    }
}
