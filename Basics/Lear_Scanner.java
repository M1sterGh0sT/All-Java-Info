package AllInfo.Basics;

import java.util.Scanner;

public class Lear_Scanner {
    static public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");

        // example with string
        String name = scanner.nextLine();


        // example with intz
        System.out.println("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Nickname: ");
        String nickname = scanner.nextLine();


        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nickname: " + nickname);

    }
}
