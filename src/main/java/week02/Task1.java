package week02;

public class Task1 {

    /*
    Description:
Write a method that counts how many vowels (a, e, i, o, u) are in a given string.
The check should be case-insensitive.

Input:
"Education"

Output:
5
     */

    public static void main(String[] args) {


        String str="Education";

     int result=   countVowelsInWord(str);

        System.out.println(result);


    }

    private static int countVowelsInWord(String str) {
        String vovels="aieou";
        int counter=0;
        for (char each:str.toLowerCase().toCharArray()){

            if (vovels.contains(each+"")){
              counter++;
            }
        }

        return counter;
    }


    //overlaod that method countVowelsInWord
    //with the second one you will get another paramter which is isVowel
    //isVowel =true and you will return the vowel letters number
    // if false you will return the other charecter numbers
}
