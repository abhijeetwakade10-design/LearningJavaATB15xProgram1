package Test_11Jan;

import java.util.Scanner;

public class Test_7 {
    static void main(String[] args) {
        /*
        7) Simple Calculator
        Description:
        Write a Java program to perform addition,
        subtraction, multiplication, or division based
        on user choice using a switch statement.
         */

        char operator;
        double Number1, Number2 , result;


        System.out.println("enter the first number ");
        Scanner scan= new Scanner(System.in);
        Number1=scan.nextInt();
        System.out.println("enter the second number ");
        Number2 = scan.nextInt();

        System.out.println("Enter option  + , - ,* , /");
        operator =scan.next().charAt(0);
        switch (operator){
            case '+' :
                result=Number1+Number2;
                System.out.println("Addition is "+ result);
            break;

            case '-':
                result= Number1-Number2;
                System.out.println("Subtraction is "+ result);
            break;

            case '*':
                result =Number1 * Number2 ;
                System.out.println("Multiplication is "+ result);
            break;

            case '/':
                result = Number1/Number2;
                System.out.println("Division is "+ result);
            break;

            default :
                System.out.println("Enter the operator + - * / only");



        }
    }
}
