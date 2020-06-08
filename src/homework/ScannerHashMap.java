package homework;

import java.util.HashMap;
import java.util.Scanner;

public class ScannerHashMap {
    public static void main(String[] args) {

        int num = 10;
        System.out.println("num = " + num);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an int value");
        int num2 = input.nextInt();
        System.out.println("num2 = " + num2);
        for (int i=0 ; i < 5 ; i++) {
            System.out.println("\nPlease enter name:");
            String name = input.next();
            System.out.println("Hello " + name);
        }
        /**
         * Create a hashMap with 5 pairs by taking key-value pairs from the user
         * Key should be String
         * Value should be Integer
         */

        HashMap<String, Integer> user = new HashMap<>();
        System.out.println("enter the name:");
        user.keySet();



    }

}
