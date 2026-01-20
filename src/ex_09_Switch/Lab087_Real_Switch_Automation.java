package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser =scan.next();
        browser =browser.toLowerCase();// if user enter in capital or camal case or any how to compare it conver all to lower case

        switch (browser){
            case "google":
                System.out.println("you are selecting Google");
             break;

            case"firefox" :
                System.out.println("You have selected with Firefox");
                break;

            default:
                System.out.println("Enter the proper browser");

        }


    }
}
