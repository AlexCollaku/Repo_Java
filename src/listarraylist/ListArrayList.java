package listarraylist;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList {

    /**
     * Create a method, that will return all duplicates values in the given String array.
     * String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
     * Result -> ["happy", "joy", "laugh"]
     */

    /**
     * Create a method, that will return the common elements/value in two given int-array
     * int[] arr1 = {11, 32, 43, 54, 65}
     * int[] arr2 = {76, 11, 89, 43, 87, 23, 32}
     * Result -> [11, 32, 43]
     */
    public static void main(String[] args) {

        String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};

        List<String> result = new ArrayList<>();


        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].toLowerCase() == words[j].toLowerCase()) {

                    result.add(words[i]);
                }
            }
        } System.out.println("Result: " + result);
    }


        public static void array() {


            int[] arr1 = {11, 32, 43, 54, 65};
            int[] arr2 = {76, 11, 89, 43, 87, 23, 32};
            //Result -> [11, 32, 43]
            List<Integer> result = new ArrayList<>();
            int temp = 0;

            for(int i = 0; i < arr1.length; i++) {
                for(int j = 0; j < arr2.length; j++) {
                    if(arr1[i] == arr2[j]) {




                    }
                }
            }
            System.out.println(temp);

        }





    }


