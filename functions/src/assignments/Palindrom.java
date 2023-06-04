package assignments;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

//        10. [Write a function to find if a number is a palindrome or not. Take number as parameter.]
//        (https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/)

        Scanner in = new Scanner(System.in);
        System.out.println("Find a number Palindrom or not");
        System.out.print("Enter a number : ");
        int num = in.nextInt();

        boolean ans = palindrom(num);
        if (ans == true){
            System.out.print("Number is Palindrom");
        }else{
            System.out.print("Number is Not Palindrom");
        }
    }
    static boolean palindrom(int num){

        int ori = num;
        int rev = 0;
        while(num>0){

            int rem = num%10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        return ori == rev;
    }
}
