package assignments;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){

//        7. [Define a method to find out if a number is prime or not.]
//        (https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/)

        Scanner in = new Scanner(System.in);
        System.out.println("Find whether number prime or not");
        System.out.print("Enter number : ");
        int num = in.nextInt();

        if(prime(num)){
            System.out.print("Given number is prime");
        }else {
            System.out.print("Given number is not prime");
        }

    }
    static boolean prime(int n){

        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        return count==2;
    }
}
