package ex_05_TypeCasting;

public class Lab061_TypCasting_Used {
    static void main(String[] args) {

        int course =100;
        float NSRT = 18.45f;

      //  int Total= course +NSRT; // as it is implicit float capacity is higher than int its giving error
                                 // solution to this is use explicit way but it can cause data loss

        int Toatal1= course + (int)NSRT; // explicit narrowing
        System.out.println("Total1 ="+Toatal1);

        float total2 = course + NSRT; // as  total2 is of float type it capacity is bigger than int
                                      // so it is implicit
        System.out.println("total2 ="+ total2);

        float total3 = (float) course+ NSRT; // widening  - Explicit
        System.out.println("total3 ="+ total3);




    }
}
