import java.util.Arrays;

public class Class4 {

    public static void main(String[] args) {

        /**
         * Write code to create abbreviation for any given string
         * Example: String msg = "have a great day to you";
         * Expected: HAGDTY
         * String msg = "have a great day to you";
         *
         * // code
         *
         * sout("Abbreviation : " + abr);
         *
         */

        String msg = "have a great day to you";
        String abr = "";
        String[] msgWords = msg.split(" ");

        for (String word : msgWords) {
            abr = abr + word.toUpperCase().charAt(0);
        }
        System.out.println("Abbreviation : " + abr);



        /**
         *
         */
        String line = "once Upon a tImE in tHe UIVERSE"; // Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);
        String[] line1 = line.toLowerCase().split(" ");

        for ( int j = 0 ; j < line1.length ; j++) {
            System.out.println(line1[j].substring(0,1).toUpperCase() + line1[j].substring(1).toLowerCase());
        }



        /**
         * reverse string
         */
        String message = "happy holidays"; // syadiloh yppah
        String[] reverseMessage = message.split("");
        String reverseMsg = "";
        System.out.println("Message " + message);

        for (int j = reverseMessage.length-1; j >= 0 ; j--) {
            reverseMsg = reverseMsg + reverseMessage[j].toLowerCase();
        }
        System.out.println("Reverse message: " + reverseMsg.toLowerCase());


        /**
         *  Check if the word is palindrome
         *  word
         *  reverseWord = reverse the value in word-variable
         *  word.equalsIgnoreCase(reverseWord)
         *
         *  level->leveL
         *  leve
         *
         *  Another Method
         *  pick letter from index0 (i) compare with letter at last index (length-1) -> length-1-i
         *  pick letter from index1 (i) compare with letter at index -> length-2 -> length-1-i
         *
         */



        String word = "level";
        boolean result = true;
        String[] reverseWord = word.split("");
        for (int i = reverseWord.length-1; i >= 0; i--) {
            if (result) {
                System.out.println("Is " + reverseWord[i] + " a palindrome " + result);
            }
       }
        int len = word.length();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(len-1-i)) {
                result=true;
                break;
            }
            System.out.println("Is " + word + " a palindrome " + result);
        }

    }
}
