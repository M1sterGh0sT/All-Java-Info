package AllInfo.Basics;

import java.util.Random;
import java.util.Scanner;

public class MathJava {
    public static void main(String[] args) {
    /*
        double num1 = 121;
        double square_of_number = Math.sqrt(num1);

        System.out.println("Square of the number " + num1 + ": " +square_of_number);


        int num2 = 5;
        int root = 2;

        double power_of_num = Math.pow(num2, root);

         // ceil round up
        // floor round down

        System.out.println("\nSquare root " + root + " of " + num2 + " : " + power_of_num);
    */


        // Random

        Random random = new Random();
        int random_num1 = random.nextInt(6)+1;  // +1 means that random numbers will be from 1 to 6
        double random_num2 = random.nextDouble();   // from 0 to 1
        boolean random_num3 = random.nextBoolean(); // true or false
        System.out.println(random_num1);


        // find value median of 2 numbers

        double x;
        double y;
        double j;

        Scanner scanner = new Scanner(System.in);

        System.out.println("First num: ");
        x = scanner.nextDouble();

        System.out.println("Second num: ");
        y = scanner.nextDouble();

        j = Math.round(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) * 100.0) / 100.0;   // we need "100.0" to round
                                                                                     // result number to 2 digits

        System.out.println("\n\nResult: " + j);
        scanner.close();



    }
}
