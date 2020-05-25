package hwbank;

public class Account {

    public void openNewAccount(String type, int amount) {


        if (amount >= 1000) {
            System.out.println("New " + type + " account created");

        } else {
            System.out.println("Invalid type " + type + "or amount " + amount);
        }


    }
}



