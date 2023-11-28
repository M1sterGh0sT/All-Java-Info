package AllInfo.OOP.Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Call {

    public static void main(String[] args) {

        double res;
        Scanner scanner = new Scanner(System.in);

        try {


            System.out.println("Value for X: ");
            int x = scanner.nextInt();

            System.out.println("Power of X: ");
            int y = scanner.nextInt();

            res = Math.pow(x, y);

            System.out.println(res);


        } catch (ArithmeticException error) {
            System.out.println("\n\nError: \nCannot divide by 0");

        } catch (InputMismatchException error) {
            System.out.println("\n\nError: \nPossible write just digits");

        } finally {     // this part will be always printing, best part of using this is closing something
            System.out.println("Always print :)");
            scanner.close();
        }

    }

}
