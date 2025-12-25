package ex_06_Ternary_Operator;

public class Lab067_Task_To_Three_Max {
    static void main(String[] args) {


        int n1 = 2;

        int n2 = 9;

        int n3 = -11;

        System.out.println("MAX OUT OF THREE");

        int Maxnum =(n1 >n2)? n1:(n2> n3)? n2:n3;
        System.out.println("maximum number is " + Maxnum);

    }
}
