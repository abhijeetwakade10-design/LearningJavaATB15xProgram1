package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {

    public static void main(String[] args) {
        // You need to take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7,
        // you will tell which day it is.

        // Logic Building Formula

        // Step 1 - Number one is using the Scanner class.
        // Step 2 number two will be basically figuring out the expression and the day.
        // Step 3- We will basically add step 3 as a rough logic.
        // Step 4 - 4 is you will write the fix the logic and optimize.
        // Step 5 - figure out the edge cases.



        // Step 1 - Number one is using the Scanner class. :- input
        System.out.println("Enter the number between 1 to 7 to get the day");

        Scanner day =new Scanner(System.in);
        // Step 2 number two will be basically figuring out the expression and the day.
        if(day.hasNextInt()){   // .................Step 5 - figure out the edge cases.
            int dayin = day.nextInt();
            switch (dayin)
            {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wen");
                    break;
                case 4:
                    System.out.println("Thr");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                default:
                    System.out.println("enter number between 1 to 7 only");
                    break;

        }


        }else System.out.println("please Enter only Integer");



    }
}
