package code;

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
       // int[] returnedArray = {32, 14, 98, 56, 148, 78};
        System.out.println(Arrays.toString(removeSpecificValue(originalArray, remove)));


    }
        public static int[] removeSpecificValue(int[] originalArray, int remove) {
           // int[] originalArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}; --> { , , , , , , }
            // user array length = 10

          int count = 0;

            for (int i = 0; i < originalArray.length; i++) {
                if (remove == originalArray[i]) {
                    count++;

                }
            }
            int size = originalArray.length - count; // created returnedarray with length originalArray - count
            int[] returnedArray = new int[size]; // int[] array = new int[size] -> {32, 14, 98, 56, 148, 78}
            int temp = 0;
            int j = 0;
              for(int i = 0; i < originalArray.length; i++) {
                  if(originalArray[i] != remove) {
                      temp = originalArray[i];
                      if(returnedArray[j] == 0) {
                          returnedArray[j] = 0;
                          temp++;
                      }
                  }
              }
              return returnedArray;
    }
    public static int[] removeElement(int[] array, int element) {
        // int[] originalArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}; --> { , , , , , , }
        // user array length = 10
        int count = 0;

        for(int i = 0; i < array.length; i++) {
            if(element == array[i]) {
                count++;
            }
        }
        int[] returnArray = new int[array.length - count];
        int temp = 0;
        int j = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] != element) {
                temp = array[i];
                if(returnArray[j] == 0) {
                    returnArray[j] = 0;
                    temp++;

                }
            }
        } return returnArray;

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
        //find 1 in array
             // if not found
                // break -> store value in missingInt
        //find 2 in array
        //      if not found
        //         break -> store value in missingInt
        //find 3 in array
        //       if not found
        //          break -> store value in missingInt
        //find 4 in array
        //        if not found
        //           break -> store value in missingInt

        int[] arr = {1, 3, 5, 4, 2, 7};
        int checkFor = 0;

        while (true) {
            boolean found = false;
            checkFor++;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == checkFor) {
                    System.out.println(checkFor + " found");
                    break;
                }
            } if(!found) {
                break;
            }
        }
        System.out.println("Missing number: " + checkFor);

    }
    public static void returnSmallestPosValue (int[] numb) {
        int checkFor = 0;

        while (true) {
            boolean found = false;
            checkFor++;
            for(int i = 0; i < numb.length; i++) {
                if(numb[i] == checkFor) {
                    break;
                }
            } if (!found) {
                break;
            }
        }
        System.out.println("Missing number: " + checkFor);
    }

    public static void returnSmallestPositiveInteger() {
        int[] array = {-1, 3, 5, 4, 2, 7};
        int missingNumb = 1;
        boolean found = true;
        while (found) {
            found = false;
            for (int i = 0; i < array.length; i++) {
                if (missingNumb == array[i]) {
                    missingNumb++;
                    found = true;
                    break;
                }
            }
        }
        System.out.println("Missing number: " + missingNumb);
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
    public static void trafficTicketingSpeed(int userSpeed) {

        double speedLimit = 70;
        double points = (userSpeed - speedLimit)/5;
        //78 - 70 = 8;
        // 8/5 = 1.6 / int 1 point
        if(userSpeed <= 70 && points <= 0) {
            System.out.println("Thank you for driving within the speed limit");

        } else if(userSpeed > 70 && userSpeed <= 74 && points == 0) {
            System.out.println("Your speed is " + userSpeed + ". You have " + points + " points against your license.");

        } else if(points > 0 && points <= 11) {
            System.out.println("Your speed is " + userSpeed + ". You have " + points + " points against your license");

        } else if(points >= 12) {
            System.out.println("You have " + points + " points against your license. Your license is sopsended");

        }
    }
}


