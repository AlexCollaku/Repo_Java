package printerclass;

public class Printer {

    int toner = 100;
    int pages = 100;
    int pageRequired;
    int tonerRequired;


    public int addToner(int tonerToAdd) {

            if(tonerToAdd > 0 && tonerToAdd <= 100) {
                if (tonerToAdd + toner <= 100) {
                    toner = toner + tonerToAdd;
            } else {
                    System.out.println("More toner added than printer capacity"); }
            } else {
                System.out.println("Invalid toner to add");
            }
            return toner;


    }
    public int addPages(int pageToAdd) {

            if (pageToAdd > 0 && pageToAdd <= 100) {
                if (pageToAdd + pages <= 100) {
                    pages = pages + pageToAdd;
            } else {
                    System.out.println("More pages added than printer capacity"); }
            } else {
                System.out.println("Invalid pages to add");
            }
            return pages;

    }

    public int printPages(int pageToPrint) {
        boolean numbPages = true; //(double) , false (single)

        if (numbPages) {
            if(pageToPrint%2 == 0) {
                pageRequired = pageToPrint/2;
                tonerRequired = pageToPrint;

                pages = pages - pageRequired;
                toner = toner - tonerRequired;

            } else {
                pageRequired = pageToPrint/2 +1;
                tonerRequired = pageToPrint;

                pages = pages - pageRequired;
                toner = toner - tonerRequired;
            }
        } else {
            pageRequired = pageToPrint;
            tonerRequired = pageToPrint;

            pages = pages - pageRequired;
            toner = toner - tonerRequired;

            System.out.println("Printed " + pageToPrint + " number of pages, single sided");

        }return pageToPrint;

    }

    public void printerSummary() {
        //toner level
        // pages count in tray



        }

    public String checkToner() {
        String tonerLevel = "";

            if( toner < 10) {
             tonerLevel = "Add toner";

            } return tonerLevel;
        }

    }




