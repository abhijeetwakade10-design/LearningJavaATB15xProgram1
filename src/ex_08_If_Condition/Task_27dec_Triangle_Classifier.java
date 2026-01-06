package ex_08_If_Condition;
/*Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides,
determine if the triangle is equilateral (all sides are equal),
 isosceles (exactly two sides are equal), or scalene (no sides are equal).
  Use an if-else statement to classify the triangle.
*/

import java.util.Scanner;

public class Task_27dec_Triangle_Classifier {
    public static void main(String[] args) {
        int s1,s2,s3;
        System.out.println("for tringle give lent of the three sides");

        System.out.println("for s1 =");
        Scanner S1 = new Scanner(System.in);
        s1= S1.nextInt();

        System.out.println("for s2 =");
        Scanner S2= new Scanner(System.in);
        s2 = S2.nextInt();

        System.out.println("for s3 =");
        Scanner S3 = new Scanner(System.in);
        s3 =S3.nextInt();

        if (s1==s2 && s2==s3){
            System.out.println("this is equilateral tringle ");

        } else if (s1 == s2 || s2==s3 || s1 ==s3) {
            System.out.println("This is isosceles (exactly two sides are equal) Tringle");

        }else {
            System.out.println("This is scalene (no sides are equal) Tringle. ");
        }


    }
}
