package assignments;

import java.util.Scanner;

public class PythaTriplet {
    public static void main(String[] args) {
//    12. [Write a function to check if a given triplet is a Pythagorean triplet or not.](https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/)
//    (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

        Scanner in = new Scanner(System.in);
        System.out.println("Check given numbers are Pythagorean triplet or not");
        int[] arr =  {3,4,5};

        boolean ans = triplet(arr);
        if( ans == true ){
            System.out.print("Given numbers are Pythagorean triplet");
        }else{
            System.out.print("Given numbers are not Pythagorear triplet");
        }

    }
    static boolean triplet(int[] a){

        boolean ans = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {

                    int x = a[i] * a[i], y = a[j] * a[j], z = a[k] * a[k];

                    if (x == y + z || y == x + z || z == x + y) {
                        ans = true;
                    }
                }
            }
        }
        return ans;
    }
}