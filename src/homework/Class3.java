package homework;

public class Class3 {

    public static void main(String[] args) {

        /** Create variable to store student-score, and total-possible-score based on percentage,
         * display grade to student
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        int studentScore = 135;
        int maxScore = 150;
        // calcute percentage
        // Your percentage: XX.yy and your grade is: A

        double studentPercentage = 90;

        if (studentPercentage >= 91 && studentPercentage <=100) {
            System.out.println("Your percentage is: " + studentPercentage + " and your grade is: A");

        } else if (studentPercentage >= 81 && studentPercentage <= 90) {
            System.out.println("Your percentage is: " + studentPercentage + " and your grade is: B");

        } else if (studentPercentage >= 71 && studentPercentage <= 80) {
            System.out.println("Your percentage is: " + studentPercentage + " and your grade is: C");

        } else if (studentPercentage >= 61 && studentPercentage <= 70) {
            System.out.println("Your percentage is: " + studentPercentage + " and your grade is: D");

        } else if (studentPercentage >= 51 && studentPercentage <= 60) {
            System.out.println("Your percentage is: " + studentPercentage + " and your grade is: E");

        } else if (studentPercentage <= 50) {
            System.out.println("Your percentage is: " + studentPercentage + " and your grade is: F");
        }

        /** Checking car mode (P, D, N, R)
         * if car mode is P and "you can park the car"
         * if car mode is D drive car
         *         if drive type is Snow, display "Yor are on Snow mode"
         *         if drive type is Sport, display "You are on Sport mode"
         *         if drive type is Eco, display "You are on Eco mode"
         * if car mode is N you can "put the car in car wash"
         * if car mode is R you can "Reverse the car"
         */

        char carMode = 'D';
        String driveType = "Sport";

        switch (carMode) {
            case 'D':
              switch (driveType) {
            case "Sport":
                 System.out.println("You are on Sport mode");
                 break;
            case "Snow":
                 System.out.println("You are on Snow mode");
                 break;
            case "Eco":
                 System.out.println("You are on Eco mode");
             }   break;

            case 'P':
                 System.out.println("You can park the car");
                 break;
            case 'N':
                 System.out.println("Put the car in car wash");
                 break;
            case 'R':
                 System.out.println("Reverse the car");
                 break;
                 default:

        }

        /** store value in an int variable
         * if number is divisible by 3, print divisible by 3
         * if number is divisible by 5, print divisible by 5
         * if number is divisible by 3 and 5, print divisible by both
         * if not divisible by 3 or 5, print the number
         */

        int num = 21;

        if  (num%3 == 0 && num%5 == 0) {
            System.out.println("Divisible by both");

        }  else if (num%3 == 0) {
            System.out.println("Divisible by 3");

        } else if (num%5 == 0) {
            System.out.println("Divisible by 5");

        } else {
            System.out.println("Print the number: " + num);
        }

    }


}










