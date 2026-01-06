package ex_08_If_Condition;

public class Lab079_if {
    public static void main(String[] args) {

        System.out.println("Enter the age via CLI input option \n" );

        int age = Integer.parseInt(args[0]);


        if (age>= 18){
            System.out.println("you can vote");
        }else {
            System.out.println("you cant vote");
        }
    }
}
