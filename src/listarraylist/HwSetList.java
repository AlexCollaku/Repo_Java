package listarraylist;

import java.util.*;

public class HwSetList {

    public static void main(String[] args) {
        String[] array = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};

        List<String> words = Arrays.asList(array);
        System.out.println(duplicateValues(words));


        Map<String, Integer> scoressheet = new HashMap<>();
        scoressheet.put("a", 100);
        scoressheet.put("al", 100);
        scoressheet.put("c", 100);
        scoressheet.put("b", 90);

        System.out.println(getMaxScore(scoressheet));

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "happy");
        map.put(101, "happy");
        map.put(102, "laugh");
        map.put(110, "bisha");

        System.out.println(map);






        /** 1.Create a method, that will return all the duplicates values with count from the given String List.
         * List<String> words = ["happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"];
         * output:
         *   happy -> 2
         *   joy -> 3
         *   laugh -> 2
         *
         *
         *   2.Create a hashMap with any numbers of key-value pairs from the user
         *   Key should be Integer
         *   Value should be String
         *   if there are keys with same value, print the keys, otherwise print "All keys have different value
         *
         *   3.Create a hashMap with any numbers of key-value pairs from the user (Key-String, Value-Integer)
         *   Create a method that will take hashMap as input and return the name of student(s) who scored max marks.
         *
         *
         */
    }

    public static void keySameValue(Map<Integer, String> map1) {
        map1.put(100, "a");
        map1.put(110, "b");
        map1.put(105, "a");
        map1.put(106, "c");
        System.out.println(map1);


        Set<Integer> allKeys = map1.keySet();

        Collection<String> values = map1.values();

        for (int key : allKeys) {
            if (map1.get(key) == map1.get(key)) {
                    map1.get(key);


                }
            } System.out.println(allKeys);
        }







        public static  String getMaxScore(Map<String, Integer> scoressheet) {

        Collection<Integer> scores = scoressheet.values();

        Integer maxScore = Collections.max(scores);

        String topper = "";

        for(String name : scoressheet.keySet()) {
            if(scoressheet.get(name) == maxScore) {
                topper = topper + "\n" + name;

            }
        }
        return topper;

    }




        public static List<String> duplicateValues (List<String> words) {

        List<String> duplicate = new ArrayList<>();

        for(String word : words) {
            if(words.indexOf(word) != words.lastIndexOf(word)) {
                duplicate.add(word);

            }
        } return duplicate;
    }
}

