package AllInfo.Basics;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";


        /*
        // while loop
        while (name.isBlank()) { // isBlank() -> if user press "Enter" loop will work until user write his name
            System.out.println("Enter your nickname");
            name = scanner.nextLine();
        }
        System.out.println(name);
        */

        /*
        do {
            System.out.println("Enter your nickname");
            name = scanner.nextLine();
        } while (name.isBlank()); // also if user will use just "Space" method Blank() pretend this
        System.out.println(name);
        */



         // for loop
        // decrementing
        /*
        for (int j = 10; j >= 0; j--) {
            System.out.println(j);
        }
        */



        // incrementing
        /*
        for (int j = 0; j <= 10; j++) {
            System.out.println(j);
        }
        */


        // inner loops
        /*
        Scanner scanner2 = new Scanner(System.in);
        int rows;
        int columns;
        String symbol;

        System.out.println("Rows: ");
        rows = scanner2.nextInt();

        System.out.println("Columns: ");
        columns = scanner2.nextInt();

        System.out.println("Symbols: ");
        symbol = scanner2.next();


        for (int j = 1; j <= rows; j++) {
            System.out.println();
            for(int s = 1; s <= columns; s++) {
                System.out.print(symbol + " ");
            }
        }

        */


        // for-each loop

//        String[] greetings = {"Hi", "Hello", "Halo", "Ola"};

        ArrayList<String> greetings = new ArrayList<String>();
        greetings.add("Hi");
        greetings.add("Hello");
        greetings.add("Halo");
        greetings.add("Ola");



        for(String j: greetings) {      // : -> the same as in py "in" in for loop
            System.out.println(j);
        }






    }
}
