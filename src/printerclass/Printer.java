package printerclass;

public class Printer {

    int maxTonerLevel = 100;
    int maxPagesTray = 100;
    int numberOfPages;
    int numOfToner;
    int pageToPrint;


    public int addToner(int num) {

        for(int i = 0; i <= 100; i++) {
            if(num > 0 && num <= 100) {
                numOfToner = num;
            }
        } return numOfToner;


    }
    public int addPages(int number) {

        for(int i = 0; i <= 100; i++) {
            if (number > 0 && number <= 100) {
                numberOfPages = number;
            }
        } return numberOfPages;

    }

    public int printPages(int num) {

        for(int i = 0; i <= 100; i++)  {
            if (num > 0 && num <= 100) {
              pageToPrint = num;
            }
        } return pageToPrint;


    }
    public void printerSummary() {
        int tonerLevel = 0;
        int pagesCount = 0;
        for (int i = 0; i <= 100; i++) {
            if () {


            }

        }
    }
    public String checkToner() {

        String addToner = "";
        for(int i = 0; i <= 100; i--) {
            if( i < 10) {
                addToner = "Add toner";
            }
        } return addToner;

    }
}


