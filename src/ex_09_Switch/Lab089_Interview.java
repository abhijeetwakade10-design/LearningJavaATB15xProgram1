package ex_09_Switch;

public class Lab089_Interview {
    public static void main(String[] args){

        // This is to illustrate that if character given ascii value is get selected also we can give
        //ASCII Value or charter in case e.g. A or 65, B OR 66
        char ch ='A';
        switch(ch){
            case 65:
                System.out.println(" Match ASCII A");
                break;

            case 66:
                System.out.println(" Match ASCII B");
                break;

            default:
                System.out.println("No Match");
        }


    }
}
