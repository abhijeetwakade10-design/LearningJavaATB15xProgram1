package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_Multi_UserInput {
    public static void main(String[] args) {
         //this programme is demo of multiple input accept from user.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side s1");
        int s1 =scanner.nextInt();

        System.out.println("Enter the side s2");
        int s2= scanner.nextInt();

        System.out.println("Enter the side s2");
        int s3 = scanner.nextInt();

        System.out.println(s1 + s2 +s3);

       scanner.close();


    }
}
