package hwbank;

public class Bank {

    public static void main(String[] args) {

        Customer c1 = new Customer("Al", "123456789", "Checking", 1000);
        c1.miniStatment();

        Customer c2 = new Customer("Alex", "12345678", "Saving", 1000);
        c2.miniStatment();

        c1.deposit(100);
        c2.withdraw(100);

        c1.openNewAccount("checking", 1000);

        Customer c3 = new Customer("Al", "123456789", "Saving", 1000);

        Account a1 = new Account();
        a1.openNewAccount("Saving", 1000);

    }
}
