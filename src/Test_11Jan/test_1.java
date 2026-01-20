package Test_11Jan;

import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
        //Write a Java program that takes two integer numbers and prints their
        // sum, difference, multiplication, division, and remainder.

        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number ");
        a =input.nextInt();
        System.out.println("Enter the second number ");
        b= input.nextInt();
        float result =  a/b;

        System.out.println("sum of two number "+(a+b) );
        System.out.println(" differance of two number is " +(a-b));
        System.out.println("multiplication of two number is " + (a*b));
        System.out.println("division of two number is " +(result));

    }
}
