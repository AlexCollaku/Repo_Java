package homework;

public class ClassClass {
    public static void main(String[] args) {

        String sms = "beautiful life";
        String[] reverseSms = sms.split("");
        String reverse = "";
        for(int i = reverseSms.length-1; i >= 0; i--) {
            reverse = reverse + reverseSms[i].toLowerCase();
        }
        System.out.println(reverse);

        String line = "once Upon a tImE in tHe UIVERSE"; // Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);
        String[] line1 = line.toLowerCase().split(" ");
        String line2 = "";
        for(int i = 0; i < line1.length; i++) {
            System.out.println(line1[i].substring(0,1).toUpperCase() + line1[i].substring(1).toLowerCase());
        }
        String msg1 = "It is a beautiful day";
        String[] msg1Words = msg1.split(" ");
        String abr = "";
        for(String word : msg1Words) {
            abr = abr + word.toLowerCase().charAt(0);
            System.out.println(abr);
        }


    } public static int findMax(int[] numbers) {

        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
            }
        } return max;
    }
    public static String getTopper(int[] scores, String[] names) {
        int max = scores[0];
        int scoreIndex = 0;
        String topperResult = "";
        for(int i = 0; i < scores.length; i++) {
            if(max < scores[i]) {
                max = scores[i];
                scoreIndex = i;
            }
        } topperResult = names[scoreIndex] + "scored the max score: " + max;
        return topperResult;
    }

}
