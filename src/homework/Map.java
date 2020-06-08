package homework;

import java.util.*;

public class Map {
    public static void main(String[] args) {

        /**
         * School:
         * Student1 - 55
         * Student2 - 65
         * Student3 - 75
         * Student4 - 85
         * Student5 - 95
         *
         * Store the data in appropriate variable
         * and print the name of student who scored max marks.
         *
         * 1. Store data in scoreSheet map variable
         * 2. get allValues from scoreSheet (scores)
         * 3. find max value in score-Collection
         * 4. find key(Student Name) corresponding to max-value (max-score)
         *
         */

        HashMap<String, Integer> scoreSheet = new HashMap<>();

        scoreSheet.put("Student1", 55);
        scoreSheet.put("Student2", 65);
        scoreSheet.put("Student3", 75);
        scoreSheet.put("Student4", 85);
        scoreSheet.put("Student5", 95);

        Collection<Integer> scores = scoreSheet.values();

        // Object[] arr = scores.toArray(); // another way to solve the problem
        // System.out.println(Arrays.toString(arr));

        Integer maxScore = Collections.max(scores);

        String topper = "";

        for (String name : scoreSheet.keySet()) {
            if (scoreSheet.get(name) == maxScore) {
                topper = name;
                break;
            }
        }
        System.out.println(topper + " scored max (" + maxScore + ") in the class");


        /**
         * Create a hashMap with 5 pairs by taking key-value pairs from the user
         * Key should be String
         * Value should be Integer
         */

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> schollScore = new HashMap<>();

        System.out.println("Enter student name and score:");

        for(int i = 0; i < 5; i++) {
            System.out.println("Please enter the key (String) : ");
            String key = scanner.next();
            System.out.println("Please enter value (Integer) to store with " + key + "key");
            Integer value = scanner.nextInt();
            schollScore.put(key, value);
        }
        System.out.println(schollScore);

    }


}



