package Test_11Jan;

import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {
       // 3) Explicit Type Casting

       /* Description:
        Write a Java program to convert a double value into an int using
         explicit type casting and print both values.
        */

        double D;
        System.out.println("give double type number");
        Scanner scan =new Scanner(System.in);
        D= scan.nextDouble();
        int a;
        a= (int) D;
        System.out.println( "intger a = "+a);
        System.out.println("double D ="+D);
    }
}
