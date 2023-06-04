package assignments;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

//        2. [Define a program to find out whether a given number is even or odd.]
//        (https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/)

        Scanner in = new Scanner(System.in);
        System.out.println("Find whether a number Even or Odd");
        System.out.print("Enter any number: ");
        int n = in.nextInt();

        String ans = evenOrOdd(n);
        System.out.print(ans);
    }
    static String evenOrOdd(int n){
        boolean ans = n%2==0;
        if (ans == true){
           return  "This is an Even number";
        }else {
           return  "This is an Odd number";
        }
    }
}
