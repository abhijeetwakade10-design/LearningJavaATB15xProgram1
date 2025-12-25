package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {

    // if age is greater than 18 can go to goa and age is greater than 25 he can drink

    static void main(String[] args) {

        int age = 30;
      //  String result = age>18 ?(yes : "He can goa as age is less than 18 "); >> step 1
        String result = age >18 ?(age > 25 ? "he can drink age >25": "can't drik "):"He can goa as age is less than 18 ";
       // yes is replace by expression

        System.out.println(result);
    }

}
