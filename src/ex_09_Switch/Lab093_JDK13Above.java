package ex_09_Switch;

public class Lab093_JDK13Above {
    public static void main(String[] args) {
/// no break is required above jdk 13 as we can use '->'
        int itemCode = 002;
        switch (itemCode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
