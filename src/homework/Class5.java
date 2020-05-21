package homework;

public class Class5 {
    /**
     * String[] names = {"john", "michael", "dora", "philip", "ilena", "palena"}
     * String nameToSearch = "philip";
     * Create a method that will tell the position of name of the given array
     * if name present in the name-array, tell user the position (i.e. index+1) else say, name not present
     *
     * philip is in position-4
     * happy is not present in the array
     */

    /**
     * Create a method to find average of an int-array
     *
     * Average of the given array: 123
     */

    /**
     * Create a method to find maximun value in the given int-array
     * int[] numbers = {45, 22, 11, 65, 189, 100, 91, 82};
     * Maximun value in the given array: 189
     */



    public static void main(String[] args) {

        String[] names = {"john", "michael", "dora", "philip", "ilena", "palena"};
        String nameToSearch = "palena";
        System.out.println(findPosition(names,nameToSearch));




        int[] numbers = {11, 22, 33, 44};
        double averageNumbers = average(numbers);
        System.out.println("Average of given array is: " + averageNumbers);

        int[] num = {45, 22, 11, 65, 189, 100, 91, 82};
        System.out.println(getMax(num));

        int[] scores = {90, 89, 98, 100, 92};
        String[] students = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        System.out.println(findTopper(scores, students));




    }

    public static String findPosition(String[] names, String nameToSearch) {

        int position = 0;
        String positionString = "";

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(nameToSearch)); {
                position = i + 1;
                break;
            }
        }  if (position > 0) {
            System.out.println(nameToSearch + " is on position- " + position);
        } else {
            System.out.println(nameToSearch + " is not present in the array");
        }
        return positionString;

    }

    public static double average(int[] array) {
        int total = 0;
        for (int value : array) {
            total = total + value;
        }
        return total / 2;

    }
    // Create a method to find maximun value in the given int-array
    // Maximun value in the given array: 189

    public static int getMax(int[] numbers) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
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
            for (int i = 1; i < scores.length; i++) {
                if (max < scores[i]) {
                    max = scores[i];
                    scoreIndex = i;
                }
            }
            topperResult = names[scoreIndex] + " scored the maximum score (" + max + ")";
            return topperResult;

        }
        public static String findTopper(int[] scores, String names) {
        int max = 0;
        int scoreIndex = 0;
        String topperResult = "";
        for(int i = 0; i < scores.length; i++) {
            if(max < scores[i]) {
                max = scores[i];
                scoreIndex = i;
            }
        }
        return topperResult;
        }
    }













