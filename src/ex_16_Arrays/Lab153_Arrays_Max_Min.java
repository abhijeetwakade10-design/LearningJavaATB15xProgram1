public class Lab153_Arrays_Max_Min {

    public static void main(String[] args) {
        // find max number in the array

        int [] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49 ,1};

        int max = arr[0]; // assigning 0 index to max

        for(int i =0; i< arr.length;i++){

            if( arr[i] > max )
            {
                max = arr[i];
            }

        };

        System.out.println("max number is = " + max );

        // find min number in the array

        int min= arr[0];

        for(int i =0; i< arr.length; i++){

            if( arr[i] < min) {

                min = arr[i];
            }
        }
        System.out.println("min number of arr is = " +  min);

    }


}

