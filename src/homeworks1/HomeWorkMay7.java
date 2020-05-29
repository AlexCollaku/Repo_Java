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
        String[] names1 = {"Milan", "Bisha", "Megamillion"};
        for(int i = 0; i < names1.length; i++) {
            System.out.println("Names: " + names1);
        }

        // take the value from names-array , and the print the name if name-length is 5 or more;
        // and print like ; Happy -> the first letter in upper case and the rest in lower case
        for (int i = 0 ; i < names.length ; i++) {
            if (names[i].length() >= 5) {
                System.out.println(names[i].substring(0, 1).toUpperCase() + names[i].substring(1).toLowerCase());
            }
        }
        for(int f = 0; f < names.length; f++) {
            if(names[f].length() >= 5) {
                System.out.println(names[f].substring(0,1).toUpperCase() + names[f].substring(1).toLowerCase());
            }
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

        // print the values from names-array if
        // 1. name-length is greater than or equal to 5
        // and 2. name-value contains 'p' (do not consider cases)

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() >=5 && names[i].toLowerCase().contains("p")) {
                System.out.println("Value of name: " + names[i]);
            }
        }
        System.out.println("Using simple for-loop");
        for (String name : names) {
            if (name.length() >= 5 && name.toLowerCase().contains("p")) {
                System.out.println(name);
            }
        }

        String[] months = {"Janaury", "February", "March", "April", "May", "June", "July", "Sptember", "October", "November", "December"};
        /**
         * use below data
         * Dec, Jan, Feb: Winter
         * Mar, Apr, May: Spring
         * Jun, Jul, Aug: Summer
         * Sep, Oct, Nov: Fall
         *
         * print like
         * Month: Janaury -> Season: Winter
         * Month: February -> Season: Winter
         */
        for (String month : months) {
            String season = "";
            switch (month.toLowerCase()) {
                case "janaury":
                case "february":
                case "december":
                    season = "winter";
                    break;
                case "march":
                case "april":
                case "may":
                    season = "spring";
                    break;
                case "june":
                case "july":
                case "august":
                    season = "summer";
                    break;
                case "september":
                case "october":
                case "november":
                    season = "fall";
                    break;
                default:
                    System.out.println("Invalid month name -> " + month);
            }
            System.out.println("Month: " + month + " -> Season: " + season);
            }


        }
}

