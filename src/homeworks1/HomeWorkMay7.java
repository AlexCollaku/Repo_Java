package homeworks1;

public class HomeWorkMay7 {

    public static void main(String[] args) {

        // take each name the array , and print like ;
        // Name: happy
        // Name: peace
        String[] names = {"happy", "peace", "laugh", "love", "grown", "learn"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
        }

        // take the value from names-array , and the print the name if name-length is 5 or more;
        // and print like ; Happy -> the first letter in upper case and the rest in lower case
        for (int i = 0 ; i < names.length ; i++) {
            if (names[i].length() >= 5)
            System.out.println(names[i].substring(0,1).toUpperCase() + names[i].substring(1).toLowerCase());
        }

        // take value from names-array , and print only the odd index value (1, 3 , 5 ....)

        for (int i = 1 ; i < names.length ; i+=2) {
            System.out.println(names[i]);
        }
        for (int i = 0 ; i < names.length ; i++) {
            if (i%2 != 0) {
                System.out.println(names[i]);
            }
        }

        // print names-array backwards
        // String[] names = {"happy", "peace", "laugh", "love", "grown", "learn"};
        System.out.println("print names-array backwards");
        for (int i = names.length-1 ; i >= 0 ; i--) {
            System.out.println(names[i]);
        }

    }
}
