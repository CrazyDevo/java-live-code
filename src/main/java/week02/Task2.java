package week02;

public class Task2 {

/*
Description:
Write a method that capitalizes the first letter of each word in a sentence.

Input:
"java is fun"

Output:
"Java Is Fun"
 */
    public static void main(String[] args) {


        String sentence="java   is   fun";

        String result=capitalizeWordsInSentence(sentence);
        System.out.println(result);
    }

    private static String capitalizeWordsInSentence(String sentence) {

        String [] words=sentence.split(" ");

        //String result="";

        StringBuilder result=new StringBuilder();

        for (String each : words) {

            if (each.length()>0) {
                each=  prepareWord(each);
                result.append(each);
            }

        }

        return  result.toString().trim();
    }

    private static String prepareWord(String each) {

        return (each.charAt(0) + "").toUpperCase() + each.substring(1) +" ";
    }
}
