public class HomeTest {

    public static void main(String[] args) {

        String fullname = "Happy laugh";
        String[] fullNameWords = fullname.split(" ");

        if (fullNameWords.length == 3) {
            System.out.println("First name: " + fullNameWords[0] + "\n"
                    + "Middle name: " + fullNameWords[1] + "\n" +
                    "Last name: " + fullNameWords[2]);

        } else if (fullNameWords.length == 2) {
            System.out.println("First name: " + fullNameWords[0] + "\n"
                    + "Last name: " + fullNameWords[1]);

        } else if (fullNameWords.length == 1) {
            System.out.println("First name: " + fullNameWords[0]);

        } else {
            System.out.println("Invalid full name enterd: " + fullname);
        }
    }
}

