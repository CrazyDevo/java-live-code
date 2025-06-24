package week04;

import java.util.Arrays;

public class J01_ReverseArray {


    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

      int[] result=  reverseArray(arr);

        System.out.println(Arrays.toString(result));


    }

    private static int[] reverseArray(int[] arr) {
        int[] result=new int[arr.length];

        int index=0;
        for (int i = arr.length - 1; i >= 0; i--) {

            result[index++]=arr[i];
        }


        return result;


    }
}
