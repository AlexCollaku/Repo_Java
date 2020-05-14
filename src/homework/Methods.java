package homework;

public class Methods {

    /**
     * Method: lines of code to perform a specific task
     *
     * Benefits :
     * 1. to not to repeat code
     *
     * Syntax:
     * <access-Modifier> [static] <dataType-of-value-method-returns|void> <methodName>
     *
     */
    public static void main(String[] args) {

        String words = "level";
        boolean checkString = isPalindrome(words);
        System.out.println("The word " + words + " is a palindrome: " + checkString);


        String msg = "Bisha";
        String reverseMsg = reverseString(msg);
        System.out.println("Reverse of msg: " + msg + " is " + reverseMsg);

        int[] numbers = {11,22,33,44};
        int numbersTotal = arrayTotal(numbers);
        System.out.println("Total " + numbersTotal);

        String msg1 = "have a great day to you";
        String abr1 = "";
        String[] msgWords1 = msg1.split(" ");

        for (String word : msgWords1) {
            abr1 = abr1 + word.toUpperCase().charAt(0);
        }
        System.out.println("Abbreviation : " + abr1);
    }

    /**
     *
     * create a method to calculate sum of values in a given int-array
     */

    public static int arrayTotal(int [] array) {
        int total = 0;
        for (int value : array) {
            total = total + value;
        }
        return total;
    }
    /**
     * create a method to reverse a string
     */
    public static String reverseString(String message) {
        String reverseMessage = "";

        for (int i = message.length()-1; i >= 0; i--) {
            reverseMessage = reverseMessage + message.charAt(i);
        }
        return reverseMessage;
    }
    /**
     * create a method to find if a string is a palindrome
     */
    public static boolean isPalindrome(String word) {
        /**
         * reverse the string and compare
         */
        String reverse = reverseString(word);
        return reverse.equalsIgnoreCase(word);
    }

}

