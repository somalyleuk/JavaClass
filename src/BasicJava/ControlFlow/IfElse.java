package BasicJava.ControlFlow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        //if statement
//        int a = 5;
//        if(a == 5) {
//            System.out.println("A is equal to 5");
//        }
//        System.out.println("End of program");


        //if else statement
//        int b = -5;
//        if(b >= 0) {
//            System.out.println("B is positive number");
//        }
//        else {
//            System.out.println("B is negative number");
//        }
//        System.out.println("End of program");


        //if-else-if statement
        Scanner input = new Scanner(System.in);
        char grade;
        int score = 0;
        try{
            System.out.print("Enter score: ");
            score = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter a number");
        }
        if (score >= 90 && score <= 100){
            grade = 'A';
        } else if (score >=80 && score < 90){
            grade = 'B';
        } else if ( score >= 70 && score < 80){
            grade = 'C';
        } else{
            grade = 'D';
        }
        System.out.println("Your grade is : " + grade);
        System.out.println("End of program");

    }
}
