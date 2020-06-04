package exception;

import java.util.Scanner;

public class ExceptionScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pls input a int number.");
        int num1 = scan.nextInt();
        System.out.println("Pls input another int number.");
        int num2 = scan.nextInt();
        try {
            int result = num1/num2;
            System.out.println(result);
        }catch (ArithmeticException exception){
            System.out.println("Your input is not valid for calculation.");
            try {
                System.out.println("Pls input a int number.");
                int num5 = scan.nextInt();
                System.out.println("Pls input another int number.");
                int num6 = scan.nextInt();
                int result = num5 / num6;
                System.out.println(result);
            }catch (ArithmeticException e){
            }
//            exception.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (ArrayStoreException e){
            e.printStackTrace();
        }finally {
            System.out.println("Now we are going to do another calculation.");
        }
        System.out.println("Pls input a int number.");
        int num3 = scan.nextInt();
        System.out.println("Pls input another int number.");
        int num4 = scan.nextInt();
        System.out.println(num3*num4);
    }
}
