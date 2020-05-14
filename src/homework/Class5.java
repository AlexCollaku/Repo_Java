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

    /**
     * Create a method that will tell the name of student with maximum marks/score
     * int[] scores = {90, 89, 98, 100, 92};
     * String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
     * Kaitlin scored the maximum score(100)
     */

    public static void main(String[] args) {

        namePosition();

        int[] numbers = {11, 22, 33, 44};
        double averageNumbers = average(numbers);
        System.out.println("Average of given array is: " + averageNumbers);

    }

    public static int namePosition() {
        String[] names = {"john", "michael", "dora", "philip", "ilena", "palena"};
        String nameToSearch = "palena";
        int position = 0;

        for (int i = 0; i < names.length; i++) {
            boolean contains = names[i].equalsIgnoreCase(nameToSearch);
            if (contains) {
                System.out.println(names[i] + " is on position: " + (i + 1));
            } else {
                System.out.println(nameToSearch + " is not present on the array");
            }
        }
        return position;
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

    public static int maximumValue() {
        int[] numbers = {45, 22, 11, 65, 189, 100, 91, 82};

        for( int number : numbers) {
            

        }
    }
}









