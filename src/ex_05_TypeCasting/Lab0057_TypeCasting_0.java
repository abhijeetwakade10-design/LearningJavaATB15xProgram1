package ex_05_TypeCasting;

public class Lab0057_TypeCasting_0 {
    static void main(String[] args) {
        byte b=10;
        int a=b;   //  Valid syntax - Implicit - Casting Widening - JVM/ JAVA
        int a1 = (int)b;  //  Valid syntax - Explicit - Widening
        System.out.println(a);

    }
}
