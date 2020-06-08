package listarraylist;

import hwbank.Customer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LabJune6 {

    public static void main(String[] args) {

        String[] arr1 = {"man", "woman", "child", "man"};
        String[] arr2 = {"child", "grow", "man", "happy"};
        System.out.println(commonString(arr1, arr2));



        Customer c1 = createNewCustomer("Al", "12345", "Saving", 10000);
        Customer c2 = createNewCustomer("Alek", "1234567", "Saving", 20000);

        // List of customer object
        List<Customer> cList = new ArrayList<>();

        cList.add(c1);
        cList.add(c2);
    }

    public static Customer createNewCustomer (String name, String ssn, String accType, int value) {

        return new Customer(name, ssn, accType, value);
        //return c;




    }


    /**
     * (Interview- Write code to find common values in to given String-arrays.
     *
     * create a method that will take 2-String arrays as input
     * returns the common value in array to user
     *
     * {"man", "woman", "child"}
     * {"child", "grow", "man", "happy"}
     *
     * Logic 1
     * 1. add all words from both array in a list
     * ["man", "woman", "child", "child", "grow", "man", "happy"]
     * 2. find words exists for more than one time
     *     if(any such word found) {
     *         add in commonWords-List
     *         }
     * 3.return commonWords-List
     *
     * Logic 2
     * 1. pick each-word from array1
     * 2. find if it exists in array2
     *   if (is exists) {
     *       add in commonWords-List
     *   }
     */

    public static List<Integer> commonElement(int[] arr1, int[] arr2) {
        List<Integer> common = new ArrayList<>();
        List<Integer> bothArr = new ArrayList<>();

        for(int n1 : arr1) {
            bothArr.add(n1);
        }
        for(int n2 : arr2) {
            bothArr.add(n2);
        }
        for(int num : bothArr) {
            if(bothArr.indexOf(num) != bothArr.lastIndexOf(num)) {
                if(!common.contains(num)) {
                    common.add(num);
                }
            }
        } return common;
    }

    public static Set<String> commonString(String[] oldString, String[] givenString) {
        Set<String> common = new HashSet<String>();

        for(int i = 0; i < oldString.length; i++) {
            for(int j = 0; j < givenString.length; j++) {
                if(oldString[i].equalsIgnoreCase(givenString[j])) {
                    common.add(givenString[j]);
                }
            }
        } return common;
    }

}
















