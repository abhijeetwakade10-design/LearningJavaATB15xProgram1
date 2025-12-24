package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    static void main(String[] args) {

        long phone =987654321l;

       // short s =phone; // implicit narrowing is
        short s1 = (short)phone; // explicit  narrowing

        System.out.println(s1); // it gives differ value than phone as data loss happen.
    }
}
