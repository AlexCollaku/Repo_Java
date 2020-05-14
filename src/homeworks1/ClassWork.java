package homeworks1;

public class ClassWork {

    public static void main(String[] args) {

        int[] num = {10, 15, 20, 25, 30};
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int value : array) {
            total = total + value;
        }
        return total;
    }

    }


