package homeworks1;

import java.security.spec.RSAOtherPrimeInfo;

public class ClassWork {

    public static void main(String[] args) {

        // find the perfect square root from int array
        int[] intArray = {12, 15, 32, 81, 64, 144, 93, 78, 34};
        boolean breakOuterLoop = false;
        for (int num = 0; num < 20; num++) {
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] == (num * num)) {
                    System.out.println(num + "->" + intArray[i]);
                    breakOuterLoop = true;
                    break;
                }
            }
            if (breakOuterLoop) {
                break;
            }
        }


    }

    int[] num = {10, 15, 20, 25, 30};

    public static int sum(int[] array) {
        int total = 0;
        for (int value : array) {
            total = total + value;
        }
        return total;
    }

    int tonerLevel;
    int pagesInTray;

    public int[] printPages(int print, String style) {
        int[] pagesAndToner = new int[2];
        if (style == "single" && tonerLevel > 0 && pagesInTray > 0) {
            pagesInTray -= print;
            tonerLevel -= print;
        } else if (style == "double" && tonerLevel > 0 && pagesInTray > 0) {
            if (print % 2 == 0) {
                pagesInTray = print / 2;
                tonerLevel = print;
            } else {
                pagesInTray = (print / 2) + 1;
                tonerLevel = print;
            }
        }
        pagesAndToner[0] = pagesInTray;
        pagesAndToner[1] = pagesInTray;
        return pagesAndToner;
    }

    /**
     * String[] names = {"john", "michael", "dora", "philip", "ilena", "palena"}
     * String nameToSearch = "philip";
     * Create a method that will tell the position of name of the given array
     * if name present in the name-array, tell user the position (i.e. index+1) else say, name not present
     * <p>
     * philip is in position-4
     * happy is not present in the array
     */

    public static String findPosition(String[] names, String nameToSearch) {

        int position = 0;
        String stringPosition = "";

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(nameToSearch)) {
                position = i + 1;
                break;
            }
        }
        if (position > 0) {
            System.out.println(nameToSearch + " is in positon " + position);
        } else {
            System.out.println(nameToSearch + " is not present in the array");

        }
        return stringPosition;
    }

    /**
     * Create a method to find average of an int-array
     * <p>
     * Average of the given array: 123
     */
    public static double average(int[] array) {
        int total = 0;
        for (int value : array) {
            total = total + value;

        }
        return total / 2;
    }

    /**
     * Create a method to find maximun value in the given int-array
     * int[] numbers = {45, 22, 11, 65, 189, 100, 91, 82};
     * Maximun value in the given array: 189
     */

    public static int maxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;

    }

    /**
     * Create a method that will tell the name of student with maximum marks/score
     * int[] scores = {90, 89, 98, 100, 92};
     * String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
     * Kaitlin scored the maximum score(100)
     */
    public static String findTopper(int[] scores, String[] names) {
        int max = scores[0];
        int scoreIndex = 0;
        String topperResult = "";
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
                scoreIndex = i;
            }
        }
        topperResult = names[scoreIndex] + " scored the maximum score (" + max + ")";
        return topperResult;
    }

    /**
     * create a method to calculate sum of values in a given int-array
     */
    public static int arrayTotal(int[] array) {
        int total = 0;
        for (int value : array) {
            total = total + value;

        }
        return total;
    }

    /**
     * create a method to reverse a string
     */
    public static String reverseString(String name) {
        String reverseName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseName = reverseName + name.charAt(i);

        }
        return reverseName;
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

    /**
     * Write code to create abbreviation for any given string
     * Example: String msg = "have a great day to you";
     * Expected: HAGDTY
     * String msg = "have a great day to you";
     * <p>
     * // code
     * <p>
     * sout("Abbreviation : " + abr);
     */
    public static String Abbreviation(String msg) {

        String abr = "";
        String[] msgWords = msg.split(" ");

        for (String word : msgWords) {
            abr = abr + word.toUpperCase().charAt(0);
        }
        return abr;
    }

    public static String modification(String line) {
        // Once Upon A Time In The Universe
        String[] line1 = line.toLowerCase().split(" ");
        String line2 = "";
        for (int i = 0; i < line1.length; i++) {
            line2 = line1[i].toUpperCase().substring(0, 1) + line1[i].toUpperCase().substring(1);

        }
        return line2;

    }

    public static String revString(String name) {
        String[] reverseName = name.split("");
        String revName = "";

        for (int i = reverseName.length - 1; i >= 0; i--) {
            revName = revName + reverseName[i].toUpperCase();

        } return revName;
    }
    public static String issPalindrome(String name) {
        boolean result = true;
        String namePalindrome = "";
        String[] reverseName = name.toLowerCase().split("");
        for(int i = reverseName.length-1; i >= 0; i--) {
            if (result) {
                namePalindrome = "Is " + name + " a palindrome: " + result;
                break;
            }

        } return namePalindrome;
    }
    public static void isPalindrom(String name) {
        boolean result;
        int len = name.length();
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == name.charAt(len-1-i)) {
                result = true;
                break;
            }
        }
    }
    public static int printEven(int[] array) {
        int even = 0;
        for(int i = 0; i < array.length; i+=2) {
            even = array[i];

            /* for (int i = 0; i < array.length; i++) {
            if (i%2 == 0) {
            even = array[i];
            }
             */
        } return even;
    }
    public static int printOdd(int[] numbers) {
        int numb = 0;
        for(int i = 1; i < numbers.length; i+=2) {
            numb = numbers[i];

            /*
            for(int i = 0; i < numbers.length; i++) {
            if (i%2 != 0) {
            numb = numbers[i];
            }
             */
        }
        return numb;
    }
    // print names-array backwards
    // String[] names = {"happy", "peace", "laugh", "love", "grown", "learn"};
    public static String backward(String[] names) {
        String array = "";
        for(int i = names.length-1; i >= 0; i--) {
            array = names[i];
        }
        return array;

    }

    /**
     * use below data
     * Dec, Jan, Feb: Winter
     * Mar, Apr, May: Spring
     * Jun, Jul, Aug: Summer
     * Sep, Oct, Nov: Fall
     *
     * print like
     * Month: Janaury -> Season: Winter
     * Month: February -> Season: Winter
     */
    public static void findSeason(String[] months) {


        for (String month : months) {
            String season = "";
            switch (month.toLowerCase()) {
                case "december":
                case "janaury":
                case "febraury":
                    season = "winter";
                    break;
                case "march":
                case "april":
                case "may":
                    season = "spring";
                    break;
                case "june":
                case "july":
                case "august":
                    season = "summer";
                    break;
                case "september":
                case "october":
                case "november":
                    season = "fall";
                    break;
                default:
                    System.out.println("Invalid month name: " + month);

            }
            System.out.println("Month: " + month + " Season: " + season);

        }
    }

         /**
         * Find the number of vowels (a, e, i, o , u) in a given word/sentence
         */
         public static int totalVowels(String sentence) {
             int numberOfVowels = 0;
             String[] allLetters = sentence.toLowerCase().split("");
             for(int i = 0; i < allLetters.length; i++) {
                 switch (allLetters[i]) {
                     case "a":
                     case "e":
                     case "i":
                     case "o":
                     case "u":
                         numberOfVowels++;
                         break;
                 }
                 System.out.println("Number of vowels in the given sentece is: " + numberOfVowels);
             }
             return numberOfVowels;
         }

         public static int vowelCount(String msg) {
             int count = 0;
             for(int i = 0; i < msg.length(); i++) {
                 char ch = msg.toLowerCase().charAt(i);
                 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                     count++;

                 } System.out.println("Number of vowels in the given sentence is: " + count);
             }
             return count;
         }
         public static int countVowels(String sentence) {
             int counter = 0;
             char[] vowels = {'a', 'e', 'i', 'o', 'u'};
             for(int i = 0; i < sentence.length(); i++) {
                 char ch = sentence.toLowerCase().charAt(i);
                     for(char vowel : vowels) {
                         if(vowel == ch) {
                             counter++;
                         }
                     }
                 } return counter;
             }
         }



