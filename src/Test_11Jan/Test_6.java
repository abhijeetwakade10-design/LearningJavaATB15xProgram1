package Test_11Jan;

import java.util.Scanner;

public class Test_6 {
    public static void main(String[] args) {
        /*
        6) Day of the Week
        Description:
        Write a Java program to print the name of the day
        based on a number (1–7) using a switch statement.
         */

        System.out.println("Enter the number between 1 to 7");
        Scanner num =new Scanner (System.in);
        int sw = num.nextInt();

        switch(sw){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wens");
                break;
            case 4:
                System.out.println("Thurs");
                break;

            case 5:
                System.out.println(" Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun ");
                break;
            default:
                System.out.println("Enter the number between 1 to 7 ");
                break;



        }








    }
}
