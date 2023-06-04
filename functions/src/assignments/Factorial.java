package assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

//        9. [Write a program to print the factorial of a number by defining a method named 'Factorial'.](https://www.javatpoint.com/factorial-program-in-java)
//          Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.- <br/>
//<pre>
//          4! = 1 * 2 * 3 * 4 = 24
//          3! = 3 * 2 * 1 = 6
//          2! = 2 * 1 = 2
//          Also,
//          1! = 1
//          0! = 1
//</pre>

        Scanner in = new Scanner(System.in);
        System.out.println("Find factors of number");
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        System.out.print("Factorial is : ");
        factorial(num);
    }
    static void  factorial(int a){

        int sumFac = 1;
        for(int i=1; i<=a; i++){
            sumFac *= i;
            System.out.print(i+" ");
        }
        System.out.print("= "+sumFac);
    }
}
