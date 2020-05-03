package homework;

import java.util.Arrays;

public class Class2 {

    public static void main(String[] args) {

        String myName = "Aleksander";
        int myNameLength = myName.length();
        System.out.println("My name lenght is: " + myNameLength);

        boolean doesStartsWithK = myName.startsWith("K");
        System.out.println("Does starts with K? " + doesStartsWithK);

        char charAtIndex0 = myName.charAt(0);
        System.out.println("Char at index 0: " + charAtIndex0);

        boolean doesEndsWithM = myName.endsWith("M");
        System.out.println("Does my name ends with M? " + doesEndsWithM);


        String myStatment = "I am a good programmer";
        int myStatmentLen = myStatment.length();

        String last10String = myStatment.substring(myStatmentLen-10);
        System.out.println("Last word: " + last10String);

        // or
        String fromIndex11 = myStatment.substring(11);
        System.out.println("Value after exracting with begin-Index-11: " + fromIndex11);

        String[] myStatmentSplit = myStatment.split(" ");
        System.out.println(Arrays.toString(myStatmentSplit));

        // or (because I don't understand the question, word like a word or character)

        //String [] myStatmentSplit = myStatment.split("");
        //System.out.println(Arrays.toString(myStatmentSplit));

        String afterReplace = myStatment.replace('r', 'f');
        System.out.println("After replace: " + afterReplace);

        String firstName = "Aleksander";

        // from lastindex = lenght - 1 we can find lenght = lastindex + 1
        // so the lastindex in my name is 'r'

        int indexofr = firstName.indexOf("r");
        System.out.println("Index of r is: " + indexofr);

        int lenghtOfFirstName = indexofr + 1;
        System.out.println("Lenght of my name is: " + lenghtOfFirstName );
        

    }
}
