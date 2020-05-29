package labs;

import java.util.Arrays;

public class May16 {

    public static void main(String[] args) {

        /**
         * find the number of times a given value present in an array
         *
         * if value is present: Display -> <value> is present <x> times in <array>
         *  if is NOT present: Display -> values is not present in <array>
         *
         * NOTE: nos sout statement in the method
         *
         * int[] numbers = {11, 32, 43, 12, 32, 54, 11, 54, 65, 32}
         * int findPresentOf = 11;
         *
         */
        int[] numbers = {11, 32, 43, 12, 32, 54, 11, 54, 65, 32};
           int findPresentOf = 11;
        System.out.println(findNum(findPresentOf, numbers));

        totalNum("happy world");
        vowelCounter("happy world");
    }

        public static String findNum(int numToFind, int[] numbers) {
            int presenceOf = 0;
            String result = "";
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numToFind) {
                    presenceOf++;
                }
            }
            if (presenceOf > 0) {
                result = numToFind + " is present " + presenceOf + " times in " + Arrays.toString(numbers);

            } else {
                result = numToFind + " is not present in " + Arrays.toString(numbers);
            }
            return result;
        }


    /**
     * Find the number of vowels (a, e, i, o , u) in a given word/sentence
     */

    public static int totalNum(String sentence) {
        int numOfVowels = 0;
        String[] allLetters = sentence.toLowerCase().split("");
        for(int i = 0; i < allLetters.length; i++) {
            switch (allLetters[i]) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    numOfVowels++;
                    break;
            }
            System.out.println("Number of vowels in the given sentece is: " + numOfVowels);

        } return numOfVowels;

    }
    public static int vowelCounter(String sentence) {
        int count = 0;
        for(int i = 0; i < sentence.length(); i++) {
            char ch = sentence.toLowerCase().charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
            System.out.println("Number of vowels in the given sentece is: " + count);
        } return count;
    }

    public static int vowelCount(String sentence) {
        int counter = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < sentence.length(); i++) {
            char cha = sentence.toLowerCase().charAt(i);
            for (char vowel : vowels) {
                if (vowel == cha) {
                    counter++;
                }
            }

        }
        return counter;
    }

    /**
     * int[] numbers = {11, 22, 24, 15, 10, 32};
     * sort the given array
     * {10, 11, 15, 22, 24, 32}
     *
     */
    public int[] sortArray(int[] array) {

        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
            if(array[j] < array[i]) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
    }
        return array;

    }
    public int[] sortAray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[j];
                    array[i] = temp;
                }
            }
        } return array;
    }

}





