package Test_11Jan;

import java.util.Scanner;

public class Test_4 {
    public static void main(String[] args) {
        /*4) Maximum of Two Numbers

        Description:
        Write a Java program to find the maximum
        of two numbers using the ternary operator.
         */

        int a,b;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the first number");
        a= number.nextInt();
        System.out.println("Enter the 2nd number");
        b= number.nextInt();
        if(a>b){
            System.out.println("number "+a +" is greater ");
        }else{
            System.out.println("number "+b + " is greater");
        }
    }
}
