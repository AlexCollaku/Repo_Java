package hwbank;

public class Customer {

        /**
         * Bank (Main class)
         *      Customer c1 = new Customer("" , "", "" , ""); [name, ssn, accType, amount]
         *      name <- Customer
         *      ssn <- Customer
         *      accType <- Account
         *      amount <- Account
         *      if below conditions satisfy:
         *          accType: saving or checking
         *          amount: >= $1000
         *          then, an account should be created of accType
         *      else, provide relevant error to Banker
         *
         *     c1.getMiniStatement()    <- method should be in customer class
         *          Name:
         *          SSN:
         *          Account Number:
         *          Balance:
         *
         *     c1.getMiniStatement()    <- method should be in customer class(sample for customer with more than 1 account)
         *          Name:
         *          SSN:
         *          Account Number:
         *          Balance:
         *
         *          Account Number:
         *          Balance:
         *
         *     c1.makeDeposit()     <- method should be in customer
         *
         *     c1.makeWithdraw()   <- method should be in customer
         *
         *     c1.openNewAccount("", "");   [accType, amount] {A customer can have maximum 5-account in the bank}
         *      if below conditions satisfy:
         *          accType: saving or checking
         *          amount: >= $1000
         *          then, an account should be created of accType
         *      else, provide relevant error to Banker
         *
         *
         *
         * Customer Class
         *
         *
         *
         * Account Class
         *
         *
         */
    static int accNum = 1000;
    String name;
    String ssn;
    String type;
    double amount;
    double balance;
    int userAccNum;

    public Customer(String name, String ssn, String type, int amount) {
        this.name = name;
        this.ssn = ssn;
        this.type = type;
        this.amount = amount;
        userAccNum = ++accNum;
    }


    public void openNewAccount(String type, int amount) {

        if(amount >= 1000 && type == this.type && userAccNum <= 5) {
            System.out.println("New " + type + " account created");

        } else {
            System.out.println("Invalid type " + type + "or amount " + amount);
        }

    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid amount to deposit " + amount);

        } return balance;

    }
    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Invalid amount to withdraw " + amount);
        }
        return balance;
    }

    public void miniStatment() {
        System.out.println("Name: " + name + "\nSSN: " + ssn + "\nAccount Number: " + userAccNum + "\nBalance: " + balance);
    }


}
