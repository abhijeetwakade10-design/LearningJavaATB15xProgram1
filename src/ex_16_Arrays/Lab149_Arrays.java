package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main (String[] args){

        int a =10;
        int marks [] ={10,20,70,40};
        int[] marks2 ={29,99,88,88};

        int value [] = new int[4];
        value [0] = 10;
        value [1] = 11;
        value [2] = 12;
        value [3] = 13;
       // value [4] = 14; as size is 4 it is not allowed

        boolean [] is_marrid = {true, false,true,false};
        String [] ok ={"Abhij","Wakade ","Anil"};
        // Not allowed -> String [] names = {"pramod","lucky","dutta",34};

        float bb[] = new float[2];
        bb [0] =33.33f;
        bb [1] = 44.5f;

        //to print value from aaray

        for (String x : ok){
            System.out.println(x);

        }



    }

}
