package week04;

public class J03_CountEvenOddNumbers {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6,56,89,3,3,3,3,3,0};

     String result=   countEvenAndOdd(arr);

        System.out.println(result);

        //Even: 3, Odd: 3


    }

    private static String countEvenAndOdd(int[] arr) {

        int evenNumberCounter=0;

        for (int current : arr) {

            if (current%2==0)
                evenNumberCounter++;


        }


        return "Even: " + evenNumberCounter +", Odd: " + (arr.length-evenNumberCounter);



    }
}
