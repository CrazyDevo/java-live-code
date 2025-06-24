package week04;

import java.util.Arrays;

public class J04_MergeArrays {

    public static void main(String[] args) {

        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};

        //int[] merged = {1, 3, 5, 2, 4, 6};

        int [] result=mergeArray(a,b);


        System.out.println(Arrays.toString(result));

    }

    private static int[] mergeArray(int[] first, int[] last) {
        int [] result=new int[first.length+last.length];

        int position=0;
        System.out.println(position);
        for (int each : first) {
            result[position++] = each;
        }

        System.out.println("---------------");
        System.out.println(position);

        for (int each : last) {
            result[position++] = each;
        }

        System.out.println("-----------");
        System.out.println(position);


        return result;

    }
}
