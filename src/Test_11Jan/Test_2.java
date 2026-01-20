package Test_11Jan;

import java.util.Scanner;

public class Test_2 {
    public static void main() {
        /*Even or Odd Number
Description:
Write a Java program to check whether a given number is even or odd
using arithmetic operators.
        */

        int a;
        System.out.println("Enter the number ");
        Scanner scan =new Scanner(System.in);
        if(scan.hasNextInt()){
            a=scan.nextInt();
            if(a%2==0){
                System.out.println("given number is " +a+" even number");
            }else {
                System.out.println("given number is " +a+" odd number");
            }

        }else{
            System.out.println("Please give integer number ");
        }

    }
}
