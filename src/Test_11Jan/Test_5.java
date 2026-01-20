package Test_11Jan;

import java.util.Scanner;

public class Test_5 {
    public static void main(String[] args) {

/*5) Positive, Negative or Zero
Description:
Write a Java program to check whether a given number is
positive, negative, or zero using the ternary operator.
 */

int a;
System.out.println("Enter the number");
        Scanner number1 = new Scanner(System.in);
        a= number1.nextInt();
        if (a>0){
            System.out.println("number is +ve");
        }else {
            String result = a < 0 ? " -ve": "0";
            System.out.println("given number is " +result);
        }





    }
}
