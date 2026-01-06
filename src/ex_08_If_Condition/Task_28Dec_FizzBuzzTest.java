package ex_08_If_Condition;

public class Task_28Dec_FizzBuzzTest {
   /* Write a program that prints numbers from 1 to 100. However,
    for multiples of 3, print "Fizz" instead of the number, and
    for multiples of 5, print "Buzz." For numbers that
    are multiples of both 3 and 5, print "FizzBuzz."*/

    public static void main(String[] args) {
        int i;
        for(i=0;i<=100;i++){

            if(i%3 ==0 ||i%5==0){
                if(i%3 ==0 && i%5==0) {
                    System.out.println("FizzBuzz");
                }else {
                    System.out.println("Fizz");
                }
            }else System.out.println(i);
        }

    }
}
