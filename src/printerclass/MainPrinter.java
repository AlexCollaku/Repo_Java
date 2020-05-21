package printerclass;

public class MainPrinter {

    public static void main(String[] args) {

        Printer p1 = new Printer();

        System.out.println(p1.printPages(22));

        System.out.println(p1.checkToner());

        System.out.println(p1.addPages(10));

        System.out.println(p1.addToner(15));

        Printer p2 = new Printer();

        System.out.println(p2.checkToner());

        System.out.println(p2.printPages(10));

        System.out.println(p2.addPages(63));

        System.out.println(p2.addToner(15));





    }
}
