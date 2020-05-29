package code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CodeTest {




    /**
     * Question 1:
     * Create a method to return an array after remove a specific value from a given int array.
     * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     * <p>
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */
    public static void main(String[] args) {


        int[] originalArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int remove = 24;
        int[] returnedArray = {32, 14, 98, 56, 148, 78};



    }
        public static int[] removeSpecificValue(int[] originalArray, int remove) {


          int[] returnedArray;

            for (int i = 0; i < originalArray.length; i++) {
                if (remove == originalArray[i]) {
                    remove = originalArray[-1];








                }
            }
        }

    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0) from given array.
     * Example:
     * 	For array : {1, 3, 5, 4, 2, 7}
     * 	Method should return : 6
     *
     * 	For array : {-1, -3, 4, 2}
     * 	Method should return : 1
     *
     * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * 	Method should return : 4
     */
    public static void returnMisSmallPosIntr(int[] numb) {

        for(int i = 0; i < numb.length; i++) {
            for(int j = i + 1; j < numb.length; j++) {
                if (numb[j] < numb[i]) {
                    int num = numb[j];
                    numb[j] = numb[i];
                    numb[i] = num;
                }
            }
        }
    }

    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points charged against the license for over speeding.
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user gets 12 points for a speed then license is suspended
     *
     *  Example:
     *      user speed = 78 ; 1 points
     *      user speed = 88 ; 3 points
     *      user speed = 178 ; 21 points (License suspended).
     *      user speed = 70 ; Thank you for driving within the speed limit.
     *
     *      88 -> 3
     *      70
     *      70-75 : 1
     *      75-80 : 1
     *      80-85 : 1
     *      85-88
     *
     */
    public static void trafficTicketingSysytem() {
        double speedLimit = 70;
        for(int i = 0; i > 70; i+=5) {

        }
    }
}
