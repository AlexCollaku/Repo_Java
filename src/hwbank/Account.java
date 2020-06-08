package hwbank;

import java.util.Arrays;

class Accounts {

    String ssn;
    double initialAmt = 1000;
    int maxAccountForACustomer = 5;
    Accounts[] allAccounts = new Accounts[maxAccountForACustomer];
    static int startingAccountNumber = 1000;
    int[] allAccountNumbers = new int[maxAccountForACustomer];
    double[] balance = new double[maxAccountForACustomer];
    int accountCount = -1;

    public Accounts(String ssn, String accountType, double amount) {
        switch (accountType.toLowerCase()) {
            case "saving":
            case "savings":
                if (amount >= initialAmt) {
                    this.ssn = ssn;
                    System.out.println("Created a Savings account with amount ($ " + amount + ")");
                } else {
                    System.out.println("Amount ($ " + amount+ ") is less than the required initial amount ($ " + initialAmt + ")");
                    exit(1);
                }
                break;
            case "checking":
                if (amount >= initialAmt) {
                    this.ssn = ssn;
                    System.out.println("Created a Checking account with amount ($ " + amount + ")");
                } else {
                    System.out.println("Amount ($ " + amount+ ") is less than the required initial amount ($ " + initialAmt + ")");
                    exit(1);
                }
                break;
            default:
                System.out.println("Invalid account type: " + accountType);
                exit(1);
        }
        accountCount++;
        allAccounts[accountCount] = this;
        allAccountNumbers[accountCount] = ++startingAccountNumber;
        balance[accountCount] = amount;

    }

    public void openAccount(String accountType, double amount) {
        if (accountCount>= 0 && accountCount < 5) {
            switch (accountType.toLowerCase()) {
                case "saving":
                case "savings":
                    if (amount >= initialAmt) {
                        System.out.println("Created a Savings account with amount ($ " + amount + ")");
                    } else {
                        System.out.println("Amount ($ " + amount+ ") is less than the required initial amount ($ " + initialAmt + ")");
                        exit(1);
                    }
                    break;
                case "checking":
                    if (amount >= initialAmt) {
                        System.out.println("Created a Checking account with amount ($ " + amount + ")");
                    } else {
                        System.out.println("Amount ($ " + amount+ ") is less than the required initial amount ($ " + initialAmt + ")");
                        exit(1);
                    }
                    break;
                default:
                    System.out.println("Invalid account type: " + accountType);
                    exit(1);
            }
            accountCount++;
            allAccounts[accountCount] = this;
            allAccountNumbers[accountCount] = ++startingAccountNumber;
            balance[accountCount] = amount;
        }
    }

    private void exit(int i) {
    }


    public void showAccountNumbersForCustomer() {
        System.out.println(Arrays.toString(this.allAccountNumbers));
    }

    public void showAccountDetails() {
        System.out.println("*****You have total " + (accountCount+1) + " accounts with us *****");
        for (int i = 0; i< allAccountNumbers.length ; i++) {
            if (allAccountNumbers[i] != 0) {
                System.out.println("Account Number: " + allAccountNumbers[i]);
                System.out.println("Balance:  " + balance[i]);
            }
        }
        System.out.println("*******************\n");
    }

    public void deposit(double amount, int accountNumber) {
        System.out.println("Starting process to deposit " + amount + " in account number " + accountNumber);
        boolean accountFound = false;
        int accountPosition=0;
        for (int i=0 ; i < allAccountNumbers.length ; i++) {
            if (allAccountNumbers[i] == accountNumber) {
                accountFound = true;
                accountPosition = i;
            }
        }
        if (accountFound) {
            System.out.println("Account Found...\nChecking amount to deposit");
            if (amount > 0) {
                balance[accountPosition] += amount;
                System.out.println("Deposited amount ($ " + amount + ") is deposited successfully");
            } else {
                System.out.println("Attempt to add invalid amount ($ " + amount + ") in account - " + allAccountNumbers[accountPosition]);
            }
        } else {
            System.out.println("Account (" + accountNumber + ") is not associated with the customer");
        }
    }


}




