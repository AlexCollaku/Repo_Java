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
        String[] abr = msg.split(" ");

        for (int i= 0 ; i < abr.length ; i++) {
            System.out.println("Abbreviation: " + abr[i].toUpperCase().charAt(0));
        }



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
        System.out.println("Message " + message);

        for (int j = reverseMessage.length-1; j >= 0 ; j--) {
            System.out.println("Reverse message: " + reverseMessage[j].toLowerCase());
        }


        /**
         *  Check if the word is palindrome
         */


        String word = "level";
        boolean result = true;
        String[] reverseWord = word.split("");
        for (int i = reverseWord.length-1; i >= 0; i--) {
            if (result) {
                System.out.println("Is " + reverseWord[i] + " a palindrome " + result);
            }
        }

    }
}
