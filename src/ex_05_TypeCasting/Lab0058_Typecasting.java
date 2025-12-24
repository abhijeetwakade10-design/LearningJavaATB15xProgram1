package ex_05_TypeCasting;

public class Lab0058_Typecasting {
    static void main(String[] args) {

        byte b = 10;
        int a = b; // widening ->  implcit
        int a1 = (int)b; // widening ->  explicit
        System.out.println(a1+1);
    }
}
