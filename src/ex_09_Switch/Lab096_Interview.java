package ex_09_Switch;

public class Lab096_Interview {

    public static void main(String[] args) {
        // dfault can be used at 1st
        // 1) what is the output ?
        // 2) if break is not used what is the output ?

        char code = 'C';
        switch (code){
            default:
                System.out.println("Hellooooooo");
                // break
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
