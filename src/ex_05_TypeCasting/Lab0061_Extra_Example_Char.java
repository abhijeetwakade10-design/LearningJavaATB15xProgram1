package ex_05_TypeCasting;

public class Lab0061_Extra_Example_Char {
    static void main(String[] args) {
        char ch ='A';
        int ascii =(int)ch; // widening

        System.out.println(ascii);

        int A =66;
        char letter = (char)A; // narrowing
        System.out.println(letter);



    }
}
