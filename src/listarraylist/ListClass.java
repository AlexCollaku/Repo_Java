package listarraylist;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

    public static void main(String[] args) {

        /**
         *  Collection(Interface):
         *
         *       List(Interface):
         *            ArrayList(Class): <--
         *            LinkedList(Class):
         *            Vector(Class):
         *
         *       Set(Interface):
         *            HashSet(Class): <--
         *            LinkedHashSet(Class):
         *            TreeSet(Class):
         *
         *       Map(Interface):
         *            HashMap(Class): <--
         *            LinkedHashMap(Class):
         *            TreeMap(Class):
         *
         *  Limitations of Array:
         *
         *  1. Array length can't be modified on run time
         *
         *  2. We can store values of only single-datatype in array
         *
         *  3. While creating array:
         *     either we should know , numbers of values we are going to store
         *     eg: int[] arr = new int[5];
         *     or, we should know all the values that we are going to store
         *     eg: int[] arr = {11, 22, 33, 44, 55, 66};
         *
         *   Syntax:
         *   ArrayList<datatypeClass> arrayListName = new ArrayList<>();
         *   -OR-
         *   List<datatypeClass> arrayListName = new ArrayList<>();
         *
         *   int -> Integer
         *   double -> Double
         *   char -> Character
         *   String -> String
         *
         *   eg:
         *   ArrayList<Integer> arrayListName = new ArrayList<>();
         *
         * */

        List<Integer> myList = new ArrayList<>(); // -> datatype of myList -> Integer List
        // storing object of ArrayList in reference variable of List

        System.out.println("Length of my List: " + myList.size());

        // to add values
        myList.add(11);
        myList.add(15);
        myList.add(20);
        myList.add(22);






    }
}
