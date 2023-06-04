package assignments;

import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        
//        8. [Write a program that will ask the user to enter his/her marks (out of 100).
//        Define a method that will display grades according to the marks entered as below:](https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) <br/>
//                <pre> 
//                Marks        Grade 
//                91-100         AA 
//                81-90          AB 
//                71-80          BB 
//                61-70          BC 
//                51-60          CD 
//                41-50          DD 
//                <=40          Fail 
//</pre>

        Scanner in = new Scanner(System.in);
        System.out.println("Find your grade by entering marks");
        System.out.print("Enter marks : ");
        int marks = in.nextInt();
        
        System.out.print("Grade is : "+grade(marks));
    }
    static String grade(int m){
        
        String ans = null;
        
        if (m >= 91 && m <=100){
            ans = "AA";
        }else if (m >= 81 && m <=90){
            ans = "AB";
        }else if (m >= 71 && m <=80){
            ans = "BB";
        }else if (m >= 61 && m <=70){
            ans = "BC";
        }else if (m >= 51 && m <=60){
            ans = "CC";
        }else if (m >= 41 && m <=50){
            ans = "CD";
        }else if (m >= 0 && m <=40){
            ans = "Fail";
    }
        return ans;
    }
}
