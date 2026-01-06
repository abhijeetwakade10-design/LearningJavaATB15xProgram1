package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner {
    public static void main(String[] args) {

        // How to take the user Input
        // 1. CLI Options :- done

        Scanner scan =new Scanner(System.in);
        System.out.println("User please enter the age");

        int age = scan.nextInt();
        System.out.println("you have enter age " + age);

        if(age >=18){
            System.out.println("you can vote");
        }else {
            System.out.println("you can't vote");
        }




    }
}
