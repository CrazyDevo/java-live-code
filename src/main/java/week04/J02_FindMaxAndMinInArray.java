package week04;

public class J02_FindMaxAndMinInArray {


    public static void main(String[] args) {

        int[] arr = {8, 3, 2, 2, 10, 10};


        String result=findMinMax(arr);

        System.out.println(result);

        //Max: 10, Min: 2



    }

    private static String findMinMax(int[] arr) {

        int min=arr[0]; //Integer.MAX_VALUE;
        int max=arr[0]; //Integer.MIN_VALUE;

        for (int current : arr) {
            if (current<min){
                min=current;
            }
            if (current>max){
                max=current;
            }
        }

        return "Max: "+max+", Min: "+min;
    }
}
