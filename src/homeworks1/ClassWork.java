package homeworks1;

public class ClassWork {

    public static void main(String[] args) {

        int[] num = {10, 15, 20, 25, 30};
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int value : array) {
            total = total + value;
        }
        return total;
    }
    int tonerLevel;
    int pagesInTray;

    public int[] printPages(int print, String style) {
        int[] pagesAndToner = new int[2];
        if(style == "single" && tonerLevel > 0 && pagesInTray > 0) {
            pagesInTray -= print;
            tonerLevel -= print;
        } else if (style == "double" && tonerLevel > 0 && pagesInTray > 0) {
            if(print%2 == 0) {
              pagesInTray = print / 2;
              tonerLevel = print;
        } else {
              pagesInTray = (print/2) + 1;
              tonerLevel = print;
            }
        } pagesAndToner[0] = pagesInTray;
          pagesAndToner[1] = pagesInTray;
          return pagesAndToner;
    }
}


