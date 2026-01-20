package ex_09_Switch;

import java.util.Scanner;

public class Lab086_Switch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1 to 7");

        int day =scan.nextInt();

        switch(day){

            case 1:
                System.out.println("Mon");
                break;

                case 2 :
                    System.out.println(" Tue");
                    break;
            case 3:
                System.out.println("Wens");
                break;

            default:
                System.out.println("Enter the the number between 1 to 7");






        }

    }
}
