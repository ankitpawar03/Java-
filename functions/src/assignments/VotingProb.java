package assignments;

import java.util.Scanner;

public class VotingProb {
    public static void main(String[] args) {

//        3. [A person is eligible to vote if his/her age is greater than or equal to 18.
//        Define a method to find out if he/she is eligible to vote.]
//        (https://www.efaculty.in/java-programs/voting-age-program-in-java/)

        Scanner in = new Scanner(System.in);
        System.out.println("Check Voting Age Eligibility");
        System.out.print("Enter Age of Person: ");
        int age = in.nextInt();

        boolean ans = votingEligibilty(age);

        if(ans == true){
            System.out.print("Eligible for Voting");
        }
        else{
            System.out.print("Not Eligible for Voting");
        }
    }
    static boolean votingEligibilty(int age){
        return age>=18;
    }
}
