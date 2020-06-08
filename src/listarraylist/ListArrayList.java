package listarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayList {

    public static void main(String[] args) {

        String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
        List<String> names = Arrays.asList(words);
        System.out.println(duplicateElement(names));
    }

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
    public ArrayList<String> getArrayList() {

        String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};

        ArrayList<String> result = new ArrayList<>();


        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].toLowerCase() == words[j].toLowerCase()) {

                    result.add(words[i]);
                }
            }
        }  return result;
    }



    public static void array(int[] arr1, int[] arr2) {


        //int[] arr1 = {11, 32, 43, 54, 65};
        //int[] arr2 = {76, 11, 89, 43, 87, 23, 32};
        //Result -> [11, 32, 43]

        List<Integer> result = new ArrayList<>();
            for(int i = 0; i < arr1.length; i++) {
                for(int j = 0; j < arr2.length; j++) {
                    if(arr1[i] == arr2[j]) {
                        result.add(arr1[i]);
                    }
                }
            }
            System.out.println(result);
        }


    public static List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
        return list;
    }

    public static List<String> duplicateElement(List<String> arr) {

        List<String> arr1 = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++) {
            if(arr.lastIndexOf(arr.get(i)) != i) {
                arr1.add(arr.get(i));
            }
        } return arr1;
    }
}


