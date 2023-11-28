package AllInfo.OOP.DynamicPolimorphism;

import java.util.Scanner;

public class Call {

    public static void main(String[] args) {

        Animal animal = new Animal();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choice animal: [d: dog], [c: cat]");
        String choice = scanner.next();

        if (choice.equals("d")) {
            animal = new Dog();

        } else if (choice.equals("c")) {
            animal = new Cat();

        } else {
            System.out.println("\nSomething goes wrong");
        }

        animal.say();

    }

}
