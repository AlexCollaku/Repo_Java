package homework;

public class FirstClass {
    public static void main(String[] args) {

        // number of hours in a day

        byte numOfHrDay = 24;
        System.out.println("Number of hours in a day is: " + numOfHrDay);

        // number of max no. of days in a year

        short numOfMaxDaysInYear = 365;
        System.out.println("Number of max no. of days in a year is: " + numOfMaxDaysInYear);

        // total number of employees in an organisation

        int totalNumEmpInOrg = 71356;
        System.out.println("Total number of employees in an organisation is: " + totalNumEmpInOrg);

        // population in a country

        long populationCountry = 1547368234;
        System.out.println("Population in a country is: " + populationCountry);

        // interest rate

        float interestRate = 5.6f;
        System.out.println("Interest rate is: " + interestRate);

        // balance in a bank account

        double balanceBankAcc = 10168.23;
        System.out.println("Balance in a bank account is: " + balanceBankAcc);

        // does the sun rise from the west , store answer

        boolean riseOfSunW = false;
        System.out.println("The sun rise from the east: " + !riseOfSunW);

        // initials of your name

        String initialsOfMyName = "AC";
        System.out.println("Initials of my name are: " + initialsOfMyName);

        // your name

        String myName = "Aleksander Collaku";
        System.out.println("My name is: " + myName);

        // °F = 9/5 (°C) + 32 -> (9/5) * (°C) + 32

        double cTemp = 15;
        double fTemp = (9.0/5) * cTemp + 32;
        System.out.println("Temperature in Fahrenheit is: " + fTemp);

        // °F = 9/5 (K - 273) + 32 -> (9/5) (K - 273) + 32

        double kTemp = 303;
        double fTemp1 = (9.0/5) * (kTemp - 273) + 32;
        System.out.println("Temperature in Fahrenheit is: " + fTemp1);

        // K = °C + 273

        double cTemp1 = 30;
        double kTemp1 = cTemp1 + 273;
        System.out.println("Temperature in Kelvin is: " + kTemp1);

        // °C = K - 273

        double kTemp2 = 303;
        double cTemp2 = kTemp2 - 273;
        System.out.println("Temperature in Celsius is: " + cTemp2);

        // K = 5/9 (°F - 32) + 273 -> (5/9) * (°F - 32) + 273

        double fTemp2 = 86;
        double kTemp3 = (5.0/9) * (fTemp2 - 32) + 273;
        System.out.println("Temperature in Kelvin is: " + kTemp3);







    }
}
