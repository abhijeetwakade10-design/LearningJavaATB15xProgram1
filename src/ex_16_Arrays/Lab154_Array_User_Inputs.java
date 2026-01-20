package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array ");
        int size  = scan.nextInt();

        int[] number_marks = new int [size];

        for (int i =0 ; i< number_marks.length;i++){
            System.out.println("Enter the marks");

            number_marks[i] = scan.nextInt();

        }
        System.out.println("******************");

        for(int i =0;i< number_marks.length;i++ ){

            System.out.println(number_marks[i]);
        }


    }

}
