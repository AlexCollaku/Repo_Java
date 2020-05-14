package homeworks1;

public class HomeWorkClass9 {

    /**
     * Field variable (Class variable or Global variable)
     * variable which we share between the methods within a same class
     * scope is entire class
     * Local variable
     *          variables we create inside a method
     *        scope is within the method
     */
    static String msg = "Happy";

    public static void main(String[] args) {
        int a = 10;
        for (int i = 0; i < 10; i++) {
            int b = 10;
            a+=40;
            System.out.println(a);
            System.out.println(b);
        }
        int b = 200;
        System.out.println(b);
        System.out.println(a);
    }
    public static void sayHello() {
        msg = "peace";
        System.out.println("Hello " + msg);
    }
}
